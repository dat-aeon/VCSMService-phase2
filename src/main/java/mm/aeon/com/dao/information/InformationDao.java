package mm.aeon.com.dao.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mm.aeon.com.custommapper.information.InformationCustomMapper;
import mm.aeon.com.dto.information.CompanyInfoResDto;
import mm.aeon.com.dto.information.FAQInfo;
import mm.aeon.com.dto.information.TownshipCodeResDto;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class InformationDao {

	@Autowired
	private InformationCustomMapper informationCustomMapper;

	public CompanyInfoResDto getCompanyInfo() {
		CompanyInfoResDto companyInfoResDto = informationCustomMapper.getCompanyInfo();
		return companyInfoResDto;
	}

	public List<FAQInfo> getFAQInfoList() {
		List<FAQInfo> fAQInfoList = informationCustomMapper.getFAQInfoList();
		return fAQInfoList;
	}

	public List<TownshipCodeResDto> getTownshipCodeList() {
		List<TownshipCodeResDto> townshipCodeResDtoList = informationCustomMapper.getTownshipCodeList();
		return townshipCodeResDtoList;
	}
}
