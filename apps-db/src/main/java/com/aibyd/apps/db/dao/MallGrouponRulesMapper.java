package com.aibyd.apps.db.dao;

import com.aibyd.apps.db.domain.MallGrouponRules;
import com.aibyd.apps.db.domain.MallGrouponRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    long countByExample(MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByExample(MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int insert(MallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int insertSelective(MallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGrouponRules selectOneByExample(MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGrouponRules selectOneByExampleSelective(@Param("example") MallGrouponRulesExample example, @Param("selective") MallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallGrouponRules> selectByExampleSelective(@Param("example") MallGrouponRulesExample example, @Param("selective") MallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    List<MallGrouponRules> selectByExample(MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGrouponRules selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    MallGrouponRules selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallGrouponRules record, @Param("example") MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallGrouponRules record, @Param("example") MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}