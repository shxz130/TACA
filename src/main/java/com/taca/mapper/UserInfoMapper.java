package com.taca.mapper;


import com.taca.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_USER_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_USER_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_USER_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_USER_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    UserInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_USER_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IM_D_USER_INFO
     *
     * @mbg.generated Thu Sep 21 18:03:31 CST 2017
     */
    int updateByPrimaryKey(UserInfo record);
}