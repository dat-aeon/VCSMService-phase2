package mm.aeon.com.api.loancalculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Irr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mm.aeon.com.dto.locancalculator.LoanCalculatorReqDto;
import mm.aeon.com.dto.locancalculator.LoanCalculatorResDto;
import mm.aeon.com.zconfig.MessageCode;
import mm.aeon.com.zconfig.exception.BusinessLogicException;

@RestController
@RequestMapping("/loan-calculator")
public class LoanCalculatorController {

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/loan-calculate", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public LoanCalculatorResDto loanCalculate(@RequestBody LoanCalculatorReqDto loanCalculatorReqDto) throws Exception {

		validateloanCalculateInput(loanCalculatorReqDto);

		double totalProductPrice = loanCalculatorReqDto.getFinanceAmount();
		boolean motorcycleLoanFlag = loanCalculatorReqDto.isMotorCycleLoanFlag();
		int loanTerm = loanCalculatorReqDto.getLoanTerm();
		double processingFees;
		double totalRepayment;
		double modifyTotalRepayment;
		double firstPayment;
		double monthlyPayment;
		double financeAmount;
		double totalInterest;
		double downPayment = 0;
		double promoDiscount = 0;
		double insPremium = 0;
		double vatAmount = 0;
		double financeAmountForPSG = 0;
		boolean paymentOnSaleDate = true;
		double interestRateMonthly = 1.4;
		double totalInterestForPSG = 0;
		double monthlyInstallmentForPSG = 0;
		int monthlyInstallmentRound = -2;
		double monthlyInstallment = 0;
		double conSaving = 1000;
		double totalConSaving = 0;
		int firstInstallmentRound = -2;
		double initialPaymentForPSG = 0;
		double firstPaymentForPSG = 0;
		double lastPayment = 0;

		processingFees = calculateProcessingFees(motorcycleLoanFlag, totalProductPrice);
		financeAmount = calculateFinanceAmountForPSG(totalProductPrice, downPayment, promoDiscount, insPremium, vatAmount, financeAmountForPSG, paymentOnSaleDate);
		totalInterest = calculateTotalInterest(financeAmount, loanTerm, interestRateMonthly, totalInterestForPSG);
		totalRepayment = calculateTotalRepayment(financeAmount, totalInterest);
		monthlyInstallment = calculateMonthlyInstallment(totalRepayment, monthlyInstallmentForPSG, loanTerm, monthlyInstallmentRound);
		totalConSaving = calculateTotalConSaving(conSaving, loanTerm);
		firstPaymentForPSG = calculateFirstPaymentForPSG(initialPaymentForPSG, paymentOnSaleDate);
		firstPayment = calculateFirstPayment(initialPaymentForPSG, totalRepayment, monthlyInstallment, loanTerm, firstInstallmentRound, firstPaymentForPSG);
		monthlyPayment = monthlyInstallment;
		lastPayment = calculateLastPayment(totalProductPrice, firstPayment, monthlyPayment, totalInterest, loanTerm, monthlyInstallment);
		modifyTotalRepayment = modifyCalculateTotalRepayment(monthlyPayment, loanTerm, firstPayment, lastPayment);

		LoanCalculatorResDto loanCalculatorResDto = new LoanCalculatorResDto();
		loanCalculatorResDto.setConSaving(conSaving);
		loanCalculatorResDto.setFirstPayment(firstPayment);
		loanCalculatorResDto.setLastPayment(lastPayment);
		loanCalculatorResDto.setMonthlyPayment(monthlyPayment);
		loanCalculatorResDto.setProcessingFees(processingFees);
		loanCalculatorResDto.setTotalRepayment(modifyTotalRepayment);
		loanCalculatorResDto.setTotalConSaving(totalConSaving);

		return loanCalculatorResDto;

	}

	private void validateloanCalculateInput(LoanCalculatorReqDto loanCalculatorReqDto) {
		// check input fields
		if (StringUtils.isEmpty(loanCalculatorReqDto.getLoanTerm()) || StringUtils.isEmpty(loanCalculatorReqDto.getFinanceAmount())) {
			throw new BusinessLogicException(MessageCode.REQUIRED_INPUT, messageSource.getMessage(MessageCode.REQUIRED_INPUT, null, null));
		}

		if (loanCalculatorReqDto.getLoanTerm() < 6) {
			throw new BusinessLogicException(MessageCode.INVALID_LOAN_TERM_MINIMUM, messageSource.getMessage(MessageCode.INVALID_LOAN_TERM_MINIMUM, new String[] { "6" }, null));
		}

		if (loanCalculatorReqDto.getFinanceAmount() < 100000) {
			throw new BusinessLogicException(MessageCode.INVALID_FINANCE_AMOUNT_MINIMUM,
					messageSource.getMessage(MessageCode.INVALID_FINANCE_AMOUNT_MINIMUM, new String[] { "100000" }, null));
		}

		if (!loanCalculatorReqDto.isMotorCycleLoanFlag()) {
			if (loanCalculatorReqDto.getFinanceAmount() >= 100000 && loanCalculatorReqDto.getFinanceAmount() <= 150000) {
				if (loanCalculatorReqDto.getLoanTerm() < 6 && loanCalculatorReqDto.getLoanTerm() > 6) {
					throw new BusinessLogicException(MessageCode.INVALID_LOAN_TERM, messageSource.getMessage(MessageCode.INVALID_LOAN_TERM, null, null));
				}
			}
			if (loanCalculatorReqDto.getFinanceAmount() > 700000) {
				ArrayList<Integer> maxLoanTermList = new ArrayList<Integer>();
				maxLoanTermList.add(9);
				maxLoanTermList.add(12);
				maxLoanTermList.add(18);
				maxLoanTermList.add(24);

				if (!maxLoanTermList.contains(loanCalculatorReqDto.getLoanTerm())) {
					throw new BusinessLogicException(MessageCode.INVALID_LOAN_TERM, messageSource.getMessage(MessageCode.INVALID_LOAN_TERM, null, null));
				}
			} else {
				ArrayList<Integer> minLoanTermList = new ArrayList<Integer>();
				minLoanTermList.add(6);
				minLoanTermList.add(9);
				minLoanTermList.add(12);
				minLoanTermList.add(18);
				minLoanTermList.add(24);

				if (!minLoanTermList.contains(loanCalculatorReqDto.getLoanTerm())) {
					throw new BusinessLogicException(MessageCode.INVALID_LOAN_TERM, messageSource.getMessage(MessageCode.INVALID_LOAN_TERM, null, null));
				}
			}
		} else {
			ArrayList<Integer> maxLoanTermList = new ArrayList<Integer>();
			maxLoanTermList.add(12);
			maxLoanTermList.add(18);
			maxLoanTermList.add(24);
			if (!maxLoanTermList.contains(loanCalculatorReqDto.getLoanTerm())) {
				throw new BusinessLogicException(MessageCode.INVALID_LOAN_TERM, messageSource.getMessage(MessageCode.INVALID_LOAN_TERM, null, null));
			}
		}

	}

	public static double calculateLastPayment(double totalProductPrice, double firstPayment, double monthlyPayment, double totalInterest, int loanTerm, double monthlyInstallment) {
		double lastPayment = 0;
		Calendar cal = Calendar.getInstance();

		Date today = cal.getTime();
		cal.add(Calendar.MONTH, loanTerm + 1); // to get previous year add -1
		cal.set(5, 2); // set date to alway 2
		Date lastDate = cal.getTime();

		long diff = lastDate.getTime() - today.getTime();
		long totalDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

		List<Double> cashFlows = new ArrayList<Double>();
		cashFlows.add(totalProductPrice * -1);
		cashFlows.add(firstPayment);
		for (int i = 0; i < loanTerm - 1; i++) {
			cashFlows.add(monthlyPayment);
		}

		double[] target = new double[cashFlows.size()];
		for (int i = 0; i < target.length; i++) {
			target[i] = cashFlows.get(i);
		}

		double amountDue = Irr.irr(target) * 100;

		double eirDays = 0;
		if (totalDays <= 361 && totalDays >= 357) {
			eirDays = amountDue * 365 / totalDays;
		} else {
			eirDays = amountDue;
		}

		double baseEIR = amountDue;

		double apr = 0;
		if (loanTerm > 12) {
			apr = eirDays * 12;
		} else {
			apr = eirDays * loanTerm;
		}

		double apr28 = 0;
		if (apr > 28) {
			apr28 = (totalInterest * 28 / 100) / apr * 100;
		} else {
			apr28 = 0;
		}
		DecimalFormat ttt = new DecimalFormat("######");

		double readjustLastPayment = 0;
		if (apr > 28) {
			readjustLastPayment = Math.round((totalInterest - Double.parseDouble(ttt.format(apr28))) / 100) * 100;
		} else {
			readjustLastPayment = 0;
		}

		lastPayment = monthlyInstallment - readjustLastPayment;
		return lastPayment;
	}

	public static double calculateFirstPayment(double initialPaymentForPSG, double totalRepayment, double monthlyInstallment, int loanTerm, int firstInstallmentRound,
			double firstPaymentForPSG) {
		double firstPayment = 0;

		if (initialPaymentForPSG == 0) {
			double value1 = monthlyInstallment * (loanTerm - 1);
			double value2 = totalRepayment - value1;
			Integer value2AsInt = (int) value2;
			String value2AsString = value2AsInt.toString();
			String lastTwoDigitsStringForValue2;
			int lastTwoDigitsForValue2;

			if (value2AsString.length() > 2) {
				lastTwoDigitsStringForValue2 = value2AsString.substring(value2AsString.length() - 2);
			} else {
				lastTwoDigitsStringForValue2 = value2AsString;
			}
			lastTwoDigitsForValue2 = Integer.parseInt(lastTwoDigitsStringForValue2);

			if (lastTwoDigitsForValue2 < 50) {
				double value3 = monthlyInstallment * (loanTerm - 1);
				double value4 = totalRepayment - value3;
				firstPayment = excelRoundDown(value4, firstInstallmentRound);
			} else {
				double value5 = monthlyInstallment * (loanTerm - 1);
				double value6 = totalRepayment - value5;
				firstPayment = excelRoundUp(value6, firstInstallmentRound);
			}

		} else {
			firstPayment = firstPaymentForPSG;
		}

		return firstPayment;
	}

	public static double calculateFirstPaymentForPSG(double initialPaymentForPSG, boolean paymentOnSaleDate) {
		double firstPaymentForPSG = 0;
		if (paymentOnSaleDate) {
			firstPaymentForPSG = initialPaymentForPSG;
		} else {
			firstPaymentForPSG = initialPaymentForPSG;
		}

		return firstPaymentForPSG;
	}

	public static double calculateTotalConSaving(double consaving, int loanTerm) {
		double totalConSaving = consaving;
		if (loanTerm == 6) {
			totalConSaving += 100;
		} else if (loanTerm == 9 || loanTerm == 12) {
			totalConSaving += 200;
		} else if (loanTerm == 18) {
			totalConSaving += 300;
		} else if (loanTerm == 24) {
			totalConSaving += 400;
		}
		return totalConSaving;
	}

	public static double calculateMonthlyInstallment(double totalProductPrice, double monthlyInstallmentForPSG, int loanTerm, int monthlyInstallmentRound) {
		double monthlyInstallment = 0;
		if (monthlyInstallmentForPSG == 0) {
			monthlyInstallment = excelRoundDown(totalProductPrice / loanTerm, monthlyInstallmentRound);
		} else {
			monthlyInstallment = monthlyInstallmentForPSG;
		}
		return monthlyInstallment;
	}

	public static double calculateTotalRepayment(double financeAmount, double totalInterest) {
		double totalRepayment = 0;
		totalRepayment = financeAmount + totalInterest;
		return totalRepayment;
	}

	public static double modifyCalculateTotalRepayment(double monthlyPayment, int loanTerm, double firstPayment, double lastPayment) {
		double modifyTotalRepayment = 0;
		modifyTotalRepayment = (monthlyPayment * (loanTerm - 2)) + firstPayment + lastPayment;
		return modifyTotalRepayment;
	}

	public static double calculateTotalInterest(double financeAmount, int loanTerm, double interestRateMonthly, double totalInterestForPSG) {
		double totalInterest = 0;

		if (totalInterestForPSG == 0) {
			if (financeAmount * interestRateMonthly * loanTerm > 49) {
				totalInterest = Math.ceil((financeAmount / 100) * interestRateMonthly * loanTerm / 100) * 100;
			} else {
				totalInterest = Math.floor((financeAmount / 100) * interestRateMonthly * loanTerm / 100) * 100;
			}
		} else {
			totalInterest = totalInterestForPSG;
		}

		return totalInterest;
	}

	public static double calculateFinanceAmountForPSG(double totalProductPrice, double downPayment, double promoDiscount, double insPremium, double vatAmount,
			double financeAmountForPSG, boolean paymentOnSaleDate) {
		double financeAmount = 0;
		if (financeAmountForPSG == 0) {
			if (paymentOnSaleDate) {
				financeAmount = totalProductPrice - downPayment - promoDiscount + insPremium + vatAmount;
			} else {
				financeAmount = totalProductPrice - downPayment - promoDiscount + insPremium + vatAmount;
			}
		} else {
			financeAmount = financeAmountForPSG;
		}

		return financeAmount;
	}

	public static double calculateProcessingFees(boolean motorcycleLoanFlag, double totalProductPrice) {
		double processingFees = 0;
		if (motorcycleLoanFlag) {
			if (totalProductPrice >= 350000 && totalProductPrice < 400000) {
				processingFees = (double) 7000;
			} else if (totalProductPrice >= 400000 && totalProductPrice < 500000) {
				processingFees = (double) 8000;
			} else if (totalProductPrice >= 500000) {
				processingFees = (double) 10000;
			}
		} else {
			if (totalProductPrice >= 100000 && totalProductPrice <= 200000) {
				processingFees = (double) 1000;
			} else if (totalProductPrice > 200000 && totalProductPrice <= 300000) {
				processingFees = (double) 2000;
			} else if (totalProductPrice > 300000 && totalProductPrice <= 400000) {
				processingFees = (double) 3000;
			} else if (totalProductPrice > 400000 && totalProductPrice <= 500000) {
				processingFees = (double) 4000;
			} else if (totalProductPrice > 500000 && totalProductPrice <= 600000) {
				processingFees = (double) 5000;
			} else if (totalProductPrice > 600000 && totalProductPrice <= 700000) {
				processingFees = (double) 6000;
			} else if (totalProductPrice > 700000) {
				processingFees = (double) 10000;
			}
		}
		return processingFees;
	}

	public static Double excelRoundUp(double amount, int signature) {
		double roundDownValue = 0;
		if (signature > 0) {
			BigDecimal bd = new BigDecimal(amount);
			bd = bd.setScale(signature, BigDecimal.ROUND_UP);
			roundDownValue = bd.doubleValue();
		}
		if (signature < 0) {
			roundDownValue = roundItTheHardWayForRoundUp(amount, signature);
		}
		return roundDownValue;

	}

	public static Double excelRoundDown(double amount, int signature) {
		double roundDownValue = 0;
		if (signature > 0) {
			BigDecimal bd = new BigDecimal(amount);
			bd = bd.setScale(signature, BigDecimal.ROUND_DOWN);
			roundDownValue = bd.doubleValue();
		}
		if (signature < 0) {
			roundDownValue = roundItTheHardWayForRoundDown(amount, signature);
		}
		return roundDownValue;

	}

	public static Double roundItTheHardWayForRoundUp(double x, int p) {
		return ((double) Math.ceil(x * Math.pow(10, p))) / Math.pow(10, p);
	}

	public static Double roundItTheHardWayForRoundDown(double x, int p) {
		return ((double) Math.floor(x * Math.pow(10, p))) / Math.pow(10, p);
	}

	// public static void main(String[] args) {
	// double totalProductPrice = 200000;
	// boolean motorcycleLoanFlag = false;
	// int loanTerm = 9;
	// double processingFees;
	// double totalRepayment;
	// double firstPayment;
	// double monthlyPayment;
	// double financeAmount;
	// double totalInterest;
	// double downPayment = 0;
	// double promoDiscount = 0;
	// double insPremium = 0;
	// double vatAmount = 0;
	// double financeAmountForPSG = 0;
	// boolean paymentOnSaleDate = true;
	// double interestRateMonthly = 1.4;
	// double totalInterestForPSG = 0;
	// double monthlyInstallmentForPSG = 0;
	// int monthlyInstallmentRound = -2;
	// double monthlyInstallment = 0;
	// double conSaving = 1000;
	// double totalConSaving = 0;
	// int firstInstallmentRound = -2;
	// double initialPaymentForPSG = 0;
	// double firstPaymentForPSG = 0;
	// double lastPayment = 0;
	//
	// processingFees = calculateProcessingFees(motorcycleLoanFlag,
	// totalProductPrice);
	// financeAmount = calculateFinanceAmountForPSG(totalProductPrice,
	// downPayment, promoDiscount, insPremium, vatAmount, financeAmountForPSG,
	// paymentOnSaleDate);
	// totalInterest = calculateTotalInterest(financeAmount, loanTerm,
	// interestRateMonthly, totalInterestForPSG);
	// totalRepayment = calculateTotalRepayment(financeAmount, totalInterest);
	// monthlyInstallment = calculateMonthlyInstallment(totalRepayment,
	// monthlyInstallmentForPSG, loanTerm, monthlyInstallmentRound);
	// totalConSaving = calculateTotalConSaving(conSaving, loanTerm);
	// firstPaymentForPSG = calculateFirstPaymentForPSG(initialPaymentForPSG,
	// paymentOnSaleDate);
	// firstPayment = calculateFirstPayment(initialPaymentForPSG,
	// totalRepayment, monthlyInstallment, loanTerm, firstInstallmentRound,
	// firstPaymentForPSG);
	// monthlyPayment = monthlyInstallment;
	// lastPayment = calculateLastPayment(totalProductPrice, firstPayment,
	// monthlyPayment, totalInterest, loanTerm, monthlyInstallment);
	// System.out.println("Processing Fees => " + processingFees);
	// System.out.println("Finance Amount => " + financeAmount);
	// System.out.println("Total Interest => " + totalInterest);
	// System.out.println("Total Repayment => " + totalRepayment);
	// System.out.println("Monthly Installment => " + monthlyInstallment);
	// System.out.println("Total Con Saving => " + totalConSaving);
	// System.out.println("First Payment For SG => " + firstPaymentForPSG);
	// System.out.println("First Payment => " + firstPayment);
	// System.out.println("Monthly Payment => " + monthlyPayment);
	// System.out.println("Last Payment => " + lastPayment);
	//
	// }

}
