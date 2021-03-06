package mm.aeon.com.zgen.entity;

import java.util.Date;

public class CustomerInfoUpdateHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.customer_info_update_history.customer_info_update_history_id
     *
     * @mbg.generated
     */
    private Integer customerInfoUpdateHistoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.customer_info_update_history.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.customer_info_update_history.updated_time
     *
     * @mbg.generated
     */
    private Date updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.customer_info_update_history.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vcs.customer_info_update_history.customer_id
     *
     * @mbg.generated
     */
    private Integer customerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.customer_info_update_history.customer_info_update_history_id
     *
     * @return the value of vcs.customer_info_update_history.customer_info_update_history_id
     *
     * @mbg.generated
     */
    public Integer getCustomerInfoUpdateHistoryId() {
        return customerInfoUpdateHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.customer_info_update_history.customer_info_update_history_id
     *
     * @param customerInfoUpdateHistoryId the value for vcs.customer_info_update_history.customer_info_update_history_id
     *
     * @mbg.generated
     */
    public void setCustomerInfoUpdateHistoryId(Integer customerInfoUpdateHistoryId) {
        this.customerInfoUpdateHistoryId = customerInfoUpdateHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.customer_info_update_history.description
     *
     * @return the value of vcs.customer_info_update_history.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.customer_info_update_history.description
     *
     * @param description the value for vcs.customer_info_update_history.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.customer_info_update_history.updated_time
     *
     * @return the value of vcs.customer_info_update_history.updated_time
     *
     * @mbg.generated
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.customer_info_update_history.updated_time
     *
     * @param updatedTime the value for vcs.customer_info_update_history.updated_time
     *
     * @mbg.generated
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.customer_info_update_history.updated_by
     *
     * @return the value of vcs.customer_info_update_history.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.customer_info_update_history.updated_by
     *
     * @param updatedBy the value for vcs.customer_info_update_history.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vcs.customer_info_update_history.customer_id
     *
     * @return the value of vcs.customer_info_update_history.customer_id
     *
     * @mbg.generated
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vcs.customer_info_update_history.customer_id
     *
     * @param customerId the value for vcs.customer_info_update_history.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcs.customer_info_update_history
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerInfoUpdateHistoryId=").append(customerInfoUpdateHistoryId);
        sb.append(", description=").append(description);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", customerId=").append(customerId);
        sb.append("]");
        return sb.toString();
    }
}