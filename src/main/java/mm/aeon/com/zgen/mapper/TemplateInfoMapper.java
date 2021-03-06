package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.TemplateInfo;
import mm.aeon.com.zgen.entity.TemplateInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TemplateInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    long countByExample(TemplateInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    int deleteByExample(TemplateInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer templateInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    int insert(TemplateInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    int insertSelective(TemplateInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    List<TemplateInfo> selectByExampleWithRowbounds(TemplateInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    List<TemplateInfo> selectByExample(TemplateInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    TemplateInfo selectByPrimaryKey(Integer templateInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TemplateInfo record, @Param("example") TemplateInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TemplateInfo record, @Param("example") TemplateInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TemplateInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.template_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TemplateInfo record);
}