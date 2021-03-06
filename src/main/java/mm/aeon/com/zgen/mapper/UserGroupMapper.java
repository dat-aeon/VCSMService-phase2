package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.UserGroup;
import mm.aeon.com.zgen.entity.UserGroupExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.user_group
     *
     * @mbg.generated
     */
    long countByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.user_group
     *
     * @mbg.generated
     */
    int deleteByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.user_group
     *
     * @mbg.generated
     */
    int insert(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.user_group
     *
     * @mbg.generated
     */
    int insertSelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.user_group
     *
     * @mbg.generated
     */
    List<UserGroup> selectByExampleWithRowbounds(UserGroupExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.user_group
     *
     * @mbg.generated
     */
    List<UserGroup> selectByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.user_group
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.user_group
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);
}