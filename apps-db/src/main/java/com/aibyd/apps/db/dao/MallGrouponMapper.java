package com.aibyd.apps.db.dao;

import com.aibyd.apps.db.domain.MallGroupon;
import com.aibyd.apps.db.domain.MallGrouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallGrouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    long countByExample(MallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    int deleteByExample(MallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    int insert(MallGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    int insertSelective(MallGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGroupon selectOneByExample(MallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGroupon selectOneByExampleSelective(@Param("example") MallGrouponExample example, @Param("selective") MallGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallGroupon> selectByExampleSelective(@Param("example") MallGrouponExample example, @Param("selective") MallGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    List<MallGroupon> selectByExample(MallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGroupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    MallGroupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGroupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallGroupon record, @Param("example") MallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallGroupon record, @Param("example") MallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}