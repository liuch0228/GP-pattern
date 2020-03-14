package com.gupaoedu.vip.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * 封装返回结果集
 * @param <T>
 */
public interface RowMapper<T> {
    // 结果集 针对每一行进行映射，把映射结果变成一个实体类
    T mapRow(ResultSet rs,int rowNum);
}
