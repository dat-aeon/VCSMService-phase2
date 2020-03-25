package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.CouponInfo;
import mm.aeon.com.zgen.entity.CouponInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    long countByExample(CouponInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    int deleteByExample(CouponInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer couponId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    int insert(CouponInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    int insertSelective(CouponInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    List<CouponInfo> selectByExampleWithRowbounds(CouponInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    List<CouponInfo> selectByExample(CouponInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    CouponInfo selectByPrimaryKey(Integer couponId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CouponInfo record, @Param("example") CouponInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CouponInfo record, @Param("example") CouponInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CouponInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.coupon_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CouponInfo record);
}