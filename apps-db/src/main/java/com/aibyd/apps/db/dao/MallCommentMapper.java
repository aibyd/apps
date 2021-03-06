package com.aibyd.apps.db.dao;

import com.aibyd.apps.db.domain.MallComment;
import com.aibyd.apps.db.domain.MallCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    long countByExample(MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int deleteByExample(MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int insert(MallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int insertSelective(MallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallComment selectOneByExample(MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallComment selectOneByExampleSelective(@Param("example") MallCommentExample example, @Param("selective") MallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallComment> selectByExampleSelective(@Param("example") MallCommentExample example, @Param("selective") MallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    List<MallComment> selectByExample(MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallComment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    MallComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallComment selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallComment record, @Param("example") MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallComment record, @Param("example") MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}