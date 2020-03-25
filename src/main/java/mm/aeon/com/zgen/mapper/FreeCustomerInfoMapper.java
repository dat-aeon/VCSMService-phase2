package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.FreeCustomerInfo;
import mm.aeon.com.zgen.entity.FreeCustomerInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FreeCustomerInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    long countByExample(FreeCustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    int deleteByExample(FreeCustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer freeCustomerInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    int insert(FreeCustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    int insertSelective(FreeCustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    List<FreeCustomerInfo> selectByExampleWithRowbounds(FreeCustomerInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    List<FreeCustomerInfo> selectByExample(FreeCustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    FreeCustomerInfo selectByPrimaryKey(Integer freeCustomerInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FreeCustomerInfo record, @Param("example") FreeCustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FreeCustomerInfo record, @Param("example") FreeCustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FreeCustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_customer_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FreeCustomerInfo record);
}