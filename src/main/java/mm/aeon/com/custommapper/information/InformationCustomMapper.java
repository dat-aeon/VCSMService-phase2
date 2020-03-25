package mm.aeon.com.custommapper.information;

import java.util.List;

import mm.aeon.com.dto.information.CompanyInfoResDto;
import mm.aeon.com.dto.information.FAQInfo;
import mm.aeon.com.dto.information.TownshipCodeResDto;

public interface InformationCustomMapper {

	CompanyInfoResDto getCompanyInfo();

	List<FAQInfo> getFAQInfoList();

	List<TownshipCodeResDto> getTownshipCodeList();
}
