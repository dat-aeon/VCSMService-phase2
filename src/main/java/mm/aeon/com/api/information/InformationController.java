package mm.aeon.com.api.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mm.aeon.com.dto.information.CompanyInfoResDto;
import mm.aeon.com.dto.information.FAQInfo;
import mm.aeon.com.dto.information.HotlinePhoneResDto;
import mm.aeon.com.dto.information.TownshipCodeResDto;
import mm.aeon.com.services.information.InformationService;

@RestController
@RequestMapping("/information")
public class InformationController {

	@Autowired
	private InformationService informationService;

	@RequestMapping(value = "/about-us", method = RequestMethod.GET)
	public CompanyInfoResDto getCompanyInfo() throws Exception {
		return informationService.getCompanyInfo();
	}

	@RequestMapping(value = "/faq-info-list", method = RequestMethod.GET)
	public List<FAQInfo> getFAQInfoList() throws Exception {
		return informationService.getFAQInfoList();
	}

	@RequestMapping(value = "/township-code-list", method = RequestMethod.GET)
	public List<TownshipCodeResDto> getTownshipCodeList() throws Exception {
		return informationService.getTownshipCodeList();
	}

	@RequestMapping(value = "/hotline", method = RequestMethod.GET)
	public HotlinePhoneResDto getHotlinePhone() throws Exception {
		CompanyInfoResDto companyInfoResDto = informationService.getCompanyInfo();
		HotlinePhoneResDto hotlinePhoneResDto = new HotlinePhoneResDto();
		hotlinePhoneResDto.setHotlinePhone(companyInfoResDto.getHotlinePhone());
		return hotlinePhoneResDto;
	}

}
