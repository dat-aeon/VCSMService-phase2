package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.CustAgreementList;
import mm.aeon.com.zgen.entity.CustAgreementListExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustAgreementListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    long countByExample(CustAgreementListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    int deleteByExample(CustAgreementListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer custAgreementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    int insert(CustAgreementList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    int insertSelective(CustAgreementList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    List<CustAgreementList> selectByExampleWithRowbounds(CustAgreementListExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    List<CustAgreementList> selectByExample(CustAgreementListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    CustAgreementList selectByPrimaryKey(Integer custAgreementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CustAgreementList record, @Param("example") CustAgreementListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CustAgreementList record, @Param("example") CustAgreementListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CustAgreementList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_agreement_list
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CustAgreementList record);
}