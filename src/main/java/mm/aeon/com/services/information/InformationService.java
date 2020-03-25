package mm.aeon.com.services.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mm.aeon.com.dao.information.InformationDao;
import mm.aeon.com.dto.information.CompanyInfoResDto;
import mm.aeon.com.dto.information.FAQInfo;
import mm.aeon.com.dto.information.TownshipCodeResDto;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class InformationService {

	@Autowired
	private InformationDao informationDao;

	public CompanyInfoResDto getCompanyInfo() {
		return informationDao.getCompanyInfo();
	}

	public List<FAQInfo> getFAQInfoList() {
		return informationDao.getFAQInfoList();
	}

	public List<TownshipCodeResDto> getTownshipCodeList() {
		return informationDao.getTownshipCodeList();
	}

}
