package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.SubMenu;
import mm.aeon.com.zgen.entity.SubMenuExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SubMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    long countByExample(SubMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    int deleteByExample(SubMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer subMenuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    int insert(SubMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    int insertSelective(SubMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    List<SubMenu> selectByExampleWithRowbounds(SubMenuExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    List<SubMenu> selectByExample(SubMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    SubMenu selectByPrimaryKey(Integer subMenuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SubMenu record, @Param("example") SubMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SubMenu record, @Param("example") SubMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SubMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.sub_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SubMenu record);
}