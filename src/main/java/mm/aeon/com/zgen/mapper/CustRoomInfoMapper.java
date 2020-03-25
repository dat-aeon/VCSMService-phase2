package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.CustRoomInfo;
import mm.aeon.com.zgen.entity.CustRoomInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustRoomInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    long countByExample(CustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    int deleteByExample(CustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer custRoomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    int insert(CustRoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    int insertSelective(CustRoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    List<CustRoomInfo> selectByExampleWithRowbounds(CustRoomInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    List<CustRoomInfo> selectByExample(CustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    CustRoomInfo selectByPrimaryKey(Integer custRoomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CustRoomInfo record, @Param("example") CustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CustRoomInfo record, @Param("example") CustRoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CustRoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.cust_room_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CustRoomInfo record);
}