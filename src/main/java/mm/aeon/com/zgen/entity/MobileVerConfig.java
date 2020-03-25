package mm.aeon.com.zgen.entity;

import java.util.Date;

public class MobileVerConfig {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.mobile_ver_config.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.mobile_ver_config.version_no
     *
     * @mbg.generated
     */
    private String versionNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.mobile_ver_config.force_upd_flag
     *
     * @mbg.generated
     */
    private Short forceUpdFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.mobile_ver_config.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.mobile_ver_config.updated_time
     *
     * @mbg.generated
     */
    private Date updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.mobile_ver_config.os_type
     *
     * @mbg.generated
     */
    private Short osType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.mobile_ver_config.version_update_info
     *
     * @mbg.generated
     */
    private String versionUpdateInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.mobile_ver_config.id
     *
     * @return the value of vcs.mobile_ver_config.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.mobile_ver_config.id
     *
     * @param id the value for vcs.mobile_ver_config.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.mobile_ver_config.version_no
     *
     * @return the value of vcs.mobile_ver_config.version_no
     *
     * @mbg.generated
     */
    public String getVersionNo() {
        return versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.mobile_ver_config.version_no
     *
     * @param versionNo the value for vcs.mobile_ver_config.version_no
     *
     * @mbg.generated
     */
    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.mobile_ver_config.force_upd_flag
     *
     * @return the value of vcs.mobile_ver_config.force_upd_flag
     *
     * @mbg.generated
     */
    public Short getForceUpdFlag() {
        return forceUpdFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.mobile_ver_config.force_upd_flag
     *
     * @param forceUpdFlag the value for vcs.mobile_ver_config.force_upd_flag
     *
     * @mbg.generated
     */
    public void setForceUpdFlag(Short forceUpdFlag) {
        this.forceUpdFlag = forceUpdFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.mobile_ver_config.updated_by
     *
     * @return the value of vcs.mobile_ver_config.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.mobile_ver_config.updated_by
     *
     * @param updatedBy the value for vcs.mobile_ver_config.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.mobile_ver_config.updated_time
     *
     * @return the value of vcs.mobile_ver_config.updated_time
     *
     * @mbg.generated
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.mobile_ver_config.updated_time
     *
     * @param updatedTime the value for vcs.mobile_ver_config.updated_time
     *
     * @mbg.generated
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.mobile_ver_config.os_type
     *
     * @return the value of vcs.mobile_ver_config.os_type
     *
     * @mbg.generated
     */
    public Short getOsType() {
        return osType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.mobile_ver_config.os_type
     *
     * @param osType the value for vcs.mobile_ver_config.os_type
     *
     * @mbg.generated
     */
    public void setOsType(Short osType) {
        this.osType = osType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.mobile_ver_config.version_update_info
     *
     * @return the value of vcs.mobile_ver_config.version_update_info
     *
     * @mbg.generated
     */
    public String getVersionUpdateInfo() {
        return versionUpdateInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.mobile_ver_config.version_update_info
     *
     * @param versionUpdateInfo the value for vcs.mobile_ver_config.version_update_info
     *
     * @mbg.generated
     */
    public void setVersionUpdateInfo(String versionUpdateInfo) {
        this.versionUpdateInfo = versionUpdateInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.mobile_ver_config
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", versionNo=").append(versionNo);
        sb.append(", forceUpdFlag=").append(forceUpdFlag);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", osType=").append(osType);
        sb.append(", versionUpdateInfo=").append(versionUpdateInfo);
        sb.append("]");
        return sb.toString();
    }
}