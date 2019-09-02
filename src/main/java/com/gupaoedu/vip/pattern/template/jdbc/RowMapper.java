package com.gupaoedu.vip.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * 封装返回结果集
 * @param <T>
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs,int rowNum);
}
