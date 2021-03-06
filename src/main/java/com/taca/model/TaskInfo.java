package com.taca.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("TaskInfo")
public class TaskInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.TYPE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.NAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.STAR_PROFIT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long starProfit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.TIME_LENGTH
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String timeLength;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.AVAILABLE_STOCK
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long availableStock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.PERSION_AVAILABLE_STOCK
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long persionAvailableStock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.COUNT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Long count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.CATEGORY
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IM_B_TASK_INFO.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.ID
     *
     * @return the value of IM_B_TASK_INFO.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.ID
     *
     * @param id the value for IM_B_TASK_INFO.ID
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.TYPE
     *
     * @return the value of IM_B_TASK_INFO.TYPE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.TYPE
     *
     * @param type the value for IM_B_TASK_INFO.TYPE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.NAME
     *
     * @return the value of IM_B_TASK_INFO.NAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.NAME
     *
     * @param name the value for IM_B_TASK_INFO.NAME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.STAR_PROFIT
     *
     * @return the value of IM_B_TASK_INFO.STAR_PROFIT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getStarProfit() {
        return starProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.STAR_PROFIT
     *
     * @param starProfit the value for IM_B_TASK_INFO.STAR_PROFIT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStarProfit(Long starProfit) {
        this.starProfit = starProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.TIME_LENGTH
     *
     * @return the value of IM_B_TASK_INFO.TIME_LENGTH
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getTimeLength() {
        return timeLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.TIME_LENGTH
     *
     * @param timeLength the value for IM_B_TASK_INFO.TIME_LENGTH
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.STATUS
     *
     * @return the value of IM_B_TASK_INFO.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.STATUS
     *
     * @param status the value for IM_B_TASK_INFO.STATUS
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.AVAILABLE_STOCK
     *
     * @return the value of IM_B_TASK_INFO.AVAILABLE_STOCK
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getAvailableStock() {
        return availableStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.AVAILABLE_STOCK
     *
     * @param availableStock the value for IM_B_TASK_INFO.AVAILABLE_STOCK
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setAvailableStock(Long availableStock) {
        this.availableStock = availableStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.PERSION_AVAILABLE_STOCK
     *
     * @return the value of IM_B_TASK_INFO.PERSION_AVAILABLE_STOCK
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getPersionAvailableStock() {
        return persionAvailableStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.PERSION_AVAILABLE_STOCK
     *
     * @param persionAvailableStock the value for IM_B_TASK_INFO.PERSION_AVAILABLE_STOCK
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setPersionAvailableStock(Long persionAvailableStock) {
        this.persionAvailableStock = persionAvailableStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.COUNT
     *
     * @return the value of IM_B_TASK_INFO.COUNT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Long getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.COUNT
     *
     * @param count the value for IM_B_TASK_INFO.COUNT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.CATEGORY
     *
     * @return the value of IM_B_TASK_INFO.CATEGORY
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.CATEGORY
     *
     * @param category the value for IM_B_TASK_INFO.CATEGORY
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.CREATE_TIME
     *
     * @return the value of IM_B_TASK_INFO.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.CREATE_TIME
     *
     * @param createTime the value for IM_B_TASK_INFO.CREATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.UPDATE_TIME
     *
     * @return the value of IM_B_TASK_INFO.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.UPDATE_TIME
     *
     * @param updateTime the value for IM_B_TASK_INFO.UPDATE_TIME
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IM_B_TASK_INFO.CONTENT
     *
     * @return the value of IM_B_TASK_INFO.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IM_B_TASK_INFO.CONTENT
     *
     * @param content the value for IM_B_TASK_INFO.CONTENT
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    public void setContent(String content) {
        this.content = content;
    }
}