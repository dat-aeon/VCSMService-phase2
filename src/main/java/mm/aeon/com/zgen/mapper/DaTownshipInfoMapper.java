package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.DaTownshipInfo;
import mm.aeon.com.zgen.entity.DaTownshipInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DaTownshipInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    long countByExample(DaTownshipInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    int deleteByExample(DaTownshipInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer townshipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    int insert(DaTownshipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    int insertSelective(DaTownshipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    List<DaTownshipInfo> selectByExampleWithRowbounds(DaTownshipInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    List<DaTownshipInfo> selectByExample(DaTownshipInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    DaTownshipInfo selectByPrimaryKey(Integer townshipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DaTownshipInfo record, @Param("example") DaTownshipInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DaTownshipInfo record, @Param("example") DaTownshipInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DaTownshipInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_township_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DaTownshipInfo record);
}