package com.aibyd.apps.db.mybatis;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.ResultSet;

/**
 * <columnOverride column="ids" javaType="java.lang.Integer[]" typeHandler=
 * "Json2IntegerArrayTypeHandler" />
 */
public class Json2IntegerArrayTypeHandler extends BaseTypeHandler<Integer[]> {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Integer[] parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setString(i, toJson(parameter));
    }

    @Override
    public Integer[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return this.toObject(rs.getString(columnName));
    }

    @Override
    public Integer[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return this.toObject(rs.getString(columnIndex));
    }

    @Override
    public Integer[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return this.toObject(cs.getString(columnIndex));
    }

    private String toJson(Integer[] params) {
        try {
            return mapper.writeValueAsString(params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "[]";
    }

    private Integer[] toObject(String content) {
        if (content != null && !content.isEmpty()) {
            try {
                return (Integer[]) mapper.readValue(content, Integer[].class);
            } catch (Exception e) {
                throw new RuntimeException();
            }
        } else {
            return null;
        }
    }

}