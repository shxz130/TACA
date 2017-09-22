package com.taca.mapper;


import com.taca.model.HonorTitle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HonorTitleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_HONOR_TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_HONOR_TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int insert(HonorTitle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_HONOR_TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int insertSelective(HonorTitle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_HONOR_TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    HonorTitle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_HONOR_TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKeySelective(HonorTitle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_B_HONOR_TITLE
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKey(HonorTitle record);
}