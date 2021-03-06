package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.CustomerType;
import mm.aeon.com.zgen.entity.CustomerTypeExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomerTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    long countByExample(CustomerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    int deleteByExample(CustomerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer customerTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    int insert(CustomerType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    int insertSelective(CustomerType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    List<CustomerType> selectByExampleWithRowbounds(CustomerTypeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    List<CustomerType> selectByExample(CustomerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    CustomerType selectByPrimaryKey(Integer customerTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CustomerType record, @Param("example") CustomerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CustomerType record, @Param("example") CustomerTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CustomerType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CustomerType record);
}