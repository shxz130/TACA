package com.taca.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("TransRecord")
public class TransRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_TRANS_RECORD.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_TRANS_RECORD.USERNAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_TRANS_RECORD.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long starNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_TRANS_RECORD.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_TRANS_RECORD.START_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_TRANS_RECORD.FINISHED_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date finishedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_TRANS_RECORD.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_D_TRANS_RECORD.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_TRANS_RECORD.ID
     *
     * @return the value of IM_D_TRANS_RECORD.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_TRANS_RECORD.ID
     *
     * @param id the value for IM_D_TRANS_RECORD.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_TRANS_RECORD.USERNAME
     *
     * @return the value of IM_D_TRANS_RECORD.USERNAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_TRANS_RECORD.USERNAME
     *
     * @param username the value for IM_D_TRANS_RECORD.USERNAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_TRANS_RECORD.STAR_NUMBER
     *
     * @return the value of IM_D_TRANS_RECORD.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getStarNumber() {
        return starNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_TRANS_RECORD.STAR_NUMBER
     *
     * @param starNumber the value for IM_D_TRANS_RECORD.STAR_NUMBER
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStarNumber(Long starNumber) {
        this.starNumber = starNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_TRANS_RECORD.STATUS
     *
     * @return the value of IM_D_TRANS_RECORD.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_TRANS_RECORD.STATUS
     *
     * @param status the value for IM_D_TRANS_RECORD.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_TRANS_RECORD.START_TIME
     *
     * @return the value of IM_D_TRANS_RECORD.START_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_TRANS_RECORD.START_TIME
     *
     * @param startTime the value for IM_D_TRANS_RECORD.START_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_TRANS_RECORD.FINISHED_TIME
     *
     * @return the value of IM_D_TRANS_RECORD.FINISHED_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getFinishedTime() {
        return finishedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_TRANS_RECORD.FINISHED_TIME
     *
     * @param finishedTime the value for IM_D_TRANS_RECORD.FINISHED_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setFinishedTime(Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_TRANS_RECORD.CREATE_TIME
     *
     * @return the value of IM_D_TRANS_RECORD.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_TRANS_RECORD.CREATE_TIME
     *
     * @param createTime the value for IM_D_TRANS_RECORD.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_D_TRANS_RECORD.UPDATE_TIME
     *
     * @return the value of IM_D_TRANS_RECORD.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_D_TRANS_RECORD.UPDATE_TIME
     *
     * @param updateTime the value for IM_D_TRANS_RECORD.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}