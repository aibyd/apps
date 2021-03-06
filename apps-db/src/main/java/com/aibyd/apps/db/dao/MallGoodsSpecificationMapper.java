package com.aibyd.apps.db.dao;

import com.aibyd.apps.db.domain.MallGoodsSpecification;
import com.aibyd.apps.db.domain.MallGoodsSpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallGoodsSpecificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    long countByExample(MallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    int deleteByExample(MallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    int insert(MallGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    int insertSelective(MallGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGoodsSpecification selectOneByExample(MallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGoodsSpecification selectOneByExampleSelective(@Param("example") MallGoodsSpecificationExample example, @Param("selective") MallGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallGoodsSpecification> selectByExampleSelective(@Param("example") MallGoodsSpecificationExample example, @Param("selective") MallGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    List<MallGoodsSpecification> selectByExample(MallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGoodsSpecification selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    MallGoodsSpecification selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGoodsSpecification selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallGoodsSpecification record, @Param("example") MallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallGoodsSpecification record, @Param("example") MallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}