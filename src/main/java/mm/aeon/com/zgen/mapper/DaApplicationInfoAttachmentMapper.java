package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.DaApplicationInfoAttachment;
import mm.aeon.com.zgen.entity.DaApplicationInfoAttachmentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DaApplicationInfoAttachmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    long countByExample(DaApplicationInfoAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    int deleteByExample(DaApplicationInfoAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer daApplicationInfoAttachmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    int insert(DaApplicationInfoAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    int insertSelective(DaApplicationInfoAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    List<DaApplicationInfoAttachment> selectByExampleWithRowbounds(DaApplicationInfoAttachmentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    List<DaApplicationInfoAttachment> selectByExample(DaApplicationInfoAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    DaApplicationInfoAttachment selectByPrimaryKey(Integer daApplicationInfoAttachmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DaApplicationInfoAttachment record, @Param("example") DaApplicationInfoAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DaApplicationInfoAttachment record, @Param("example") DaApplicationInfoAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DaApplicationInfoAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_application_info_attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DaApplicationInfoAttachment record);
}