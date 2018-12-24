package com.aibyd.apps.db.dao;

import com.aibyd.apps.db.domain.MallSearchHistory;
import com.aibyd.apps.db.domain.MallSearchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallSearchHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    long countByExample(MallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    int deleteByExample(MallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    int insert(MallSearchHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    int insertSelective(MallSearchHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallSearchHistory selectOneByExample(MallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallSearchHistory selectOneByExampleSelective(@Param("example") MallSearchHistoryExample example, @Param("selective") MallSearchHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallSearchHistory> selectByExampleSelective(@Param("example") MallSearchHistoryExample example, @Param("selective") MallSearchHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    List<MallSearchHistory> selectByExample(MallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallSearchHistory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallSearchHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    MallSearchHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallSearchHistory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallSearchHistory record, @Param("example") MallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallSearchHistory record, @Param("example") MallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallSearchHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallSearchHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_search_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}