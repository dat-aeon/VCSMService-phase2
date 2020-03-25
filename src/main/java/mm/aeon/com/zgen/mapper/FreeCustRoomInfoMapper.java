package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.FreeCustRoomInfo;
import mm.aeon.com.zgen.entity.FreeCustRoomInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FreeCustRoomInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    long countByExample(FreeCustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    int deleteByExample(FreeCustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer freeCustRoomInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    int insert(FreeCustRoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    int insertSelective(FreeCustRoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    List<FreeCustRoomInfo> selectByExampleWithRowbounds(FreeCustRoomInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    List<FreeCustRoomInfo> selectByExample(FreeCustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    FreeCustRoomInfo selectByPrimaryKey(Integer freeCustRoomInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FreeCustRoomInfo record, @Param("example") FreeCustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FreeCustRoomInfo record, @Param("example") FreeCustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FreeCustRoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.free_cust_room_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FreeCustRoomInfo record);
}