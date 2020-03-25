package mm.aeon.com.zgen.entity;

import java.util.Date;

public class DaProductType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.da_product_type.da_product_type_id
     *
     * @mbg.generated
     */
    private Integer daProductTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.da_product_type.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.da_product_type.created_time
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.da_product_type.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.da_product_type.updated_time
     *
     * @mbg.generated
     */
    private Date updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.da_product_type.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.da_product_type.del_flag
     *
     * @mbg.generated
     */
    private Boolean delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.da_product_type.da_product_type_id
     *
     * @return the value of vcs.da_product_type.da_product_type_id
     *
     * @mbg.generated
     */
    public Integer getDaProductTypeId() {
        return daProductTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.da_product_type.da_product_type_id
     *
     * @param daProductTypeId the value for vcs.da_product_type.da_product_type_id
     *
     * @mbg.generated
     */
    public void setDaProductTypeId(Integer daProductTypeId) {
        this.daProductTypeId = daProductTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.da_product_type.name
     *
     * @return the value of vcs.da_product_type.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.da_product_type.name
     *
     * @param name the value for vcs.da_product_type.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.da_product_type.created_time
     *
     * @return the value of vcs.da_product_type.created_time
     *
     * @mbg.generated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.da_product_type.created_time
     *
     * @param createdTime the value for vcs.da_product_type.created_time
     *
     * @mbg.generated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.da_product_type.created_by
     *
     * @return the value of vcs.da_product_type.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.da_product_type.created_by
     *
     * @param createdBy the value for vcs.da_product_type.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.da_product_type.updated_time
     *
     * @return the value of vcs.da_product_type.updated_time
     *
     * @mbg.generated
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.da_product_type.updated_time
     *
     * @param updatedTime the value for vcs.da_product_type.updated_time
     *
     * @mbg.generated
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.da_product_type.updated_by
     *
     * @return the value of vcs.da_product_type.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.da_product_type.updated_by
     *
     * @param updatedBy the value for vcs.da_product_type.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.da_product_type.del_flag
     *
     * @return the value of vcs.da_product_type.del_flag
     *
     * @mbg.generated
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.da_product_type.del_flag
     *
     * @param delFlag the value for vcs.da_product_type.del_flag
     *
     * @mbg.generated
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.da_product_type
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", daProductTypeId=").append(daProductTypeId);
        sb.append(", name=").append(name);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", delFlag=").append(delFlag);
        sb.append("]");
        return sb.toString();
    }
}