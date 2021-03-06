package com.aibyd.apps.db.domain;

import java.util.ArrayList;
import java.util.List;

public class SysMenuRoleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public SysMenuRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public SysMenuRoleExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public SysMenuRoleExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Criteria newAndCreateCriteria() {
        SysMenuRoleExample example = new SysMenuRoleExample();
        return example.createCriteria();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIdEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIdNotEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIdGreaterThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIdGreaterThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIdLessThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIdLessThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdIsNull() {
            addCriterion("sys_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdIsNotNull() {
            addCriterion("sys_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdEqualTo(Integer value) {
            addCriterion("sys_menu_id =", value, "sysMenuId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysMenuIdEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_menu_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotEqualTo(Integer value) {
            addCriterion("sys_menu_id <>", value, "sysMenuId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysMenuIdNotEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_menu_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysMenuIdGreaterThan(Integer value) {
            addCriterion("sys_menu_id >", value, "sysMenuId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysMenuIdGreaterThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_menu_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_menu_id >=", value, "sysMenuId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysMenuIdGreaterThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_menu_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysMenuIdLessThan(Integer value) {
            addCriterion("sys_menu_id <", value, "sysMenuId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysMenuIdLessThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_menu_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_menu_id <=", value, "sysMenuId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysMenuIdLessThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_menu_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysMenuIdIn(List<Integer> values) {
            addCriterion("sys_menu_id in", values, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotIn(List<Integer> values) {
            addCriterion("sys_menu_id not in", values, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_menu_id between", value1, value2, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_menu_id not between", value1, value2, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysRoleIdIsNull() {
            addCriterion("sys_role_id is null");
            return (Criteria) this;
        }

        public Criteria andSysRoleIdIsNotNull() {
            addCriterion("sys_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysRoleIdEqualTo(Integer value) {
            addCriterion("sys_role_id =", value, "sysRoleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysRoleIdEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_role_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysRoleIdNotEqualTo(Integer value) {
            addCriterion("sys_role_id <>", value, "sysRoleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysRoleIdNotEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_role_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysRoleIdGreaterThan(Integer value) {
            addCriterion("sys_role_id >", value, "sysRoleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysRoleIdGreaterThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_role_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_role_id >=", value, "sysRoleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysRoleIdGreaterThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_role_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysRoleIdLessThan(Integer value) {
            addCriterion("sys_role_id <", value, "sysRoleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysRoleIdLessThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_role_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_role_id <=", value, "sysRoleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andSysRoleIdLessThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("sys_role_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSysRoleIdIn(List<Integer> values) {
            addCriterion("sys_role_id in", values, "sysRoleId");
            return (Criteria) this;
        }

        public Criteria andSysRoleIdNotIn(List<Integer> values) {
            addCriterion("sys_role_id not in", values, "sysRoleId");
            return (Criteria) this;
        }

        public Criteria andSysRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_role_id between", value1, value2, "sysRoleId");
            return (Criteria) this;
        }

        public Criteria andSysRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_role_id not between", value1, value2, "sysRoleId");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("`valid` is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("`valid` is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("`valid` =", value, "valid");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andValidEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("`valid` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("`valid` <>", value, "valid");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andValidNotEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("`valid` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("`valid` >", value, "valid");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andValidGreaterThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("`valid` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("`valid` >=", value, "valid");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andValidGreaterThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("`valid` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("`valid` <", value, "valid");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andValidLessThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("`valid` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("`valid` <=", value, "valid");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andValidLessThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("`valid` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("`valid` like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("`valid` not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("`valid` in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("`valid` not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("`valid` between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("`valid` not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("version = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionNotEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("version <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionGreaterThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("version > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionGreaterThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("version >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionLessThanColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("version < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionLessThanOrEqualToColumn(SysMenuRole.Column column) {
            addCriterion(new StringBuilder("version <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_menu_role
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private SysMenuRoleExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(SysMenuRoleExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public SysMenuRoleExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This interface was generated by MyBatis Generator.
         * This interface corresponds to the database table sys_menu_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table sys_menu_role
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_menu_role
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}