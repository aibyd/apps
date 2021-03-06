package com.aibyd.apps.db.dao;

import com.aibyd.apps.db.domain.MallUserFormid;
import com.aibyd.apps.db.domain.MallUserFormidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallUserFormidMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    long countByExample(MallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    int deleteByExample(MallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    int insert(MallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    int insertSelective(MallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallUserFormid selectOneByExample(MallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallUserFormid selectOneByExampleSelective(@Param("example") MallUserFormidExample example, @Param("selective") MallUserFormid.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallUserFormid> selectByExampleSelective(@Param("example") MallUserFormidExample example, @Param("selective") MallUserFormid.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    List<MallUserFormid> selectByExample(MallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallUserFormid selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallUserFormid.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    MallUserFormid selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallUserFormid selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallUserFormid record, @Param("example") MallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallUserFormid record, @Param("example") MallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}