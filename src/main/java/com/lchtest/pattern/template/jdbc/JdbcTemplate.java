package com.lchtest.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象模板 JDBC的操作步骤大体都是一样的：
 * 创建连接
 */
public abstract class JdbcTemplate {

     // 数据源，通过构造方法设置
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     *
     * @param sql
     * @param rowMapper
     * @param values sql入参
     * @return
     */
    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            //1.获取连接
            Connection conn = this.getConnection();
            //2.创建语句集
            PreparedStatement pstm = this.createPreparedStatement(conn, sql);
            //3.执行查询语句
            ResultSet rs = this.executeQuery(pstm, values);
            //4.封装返回结果集
            List<?> result = this.parseResultSet(rs, rowMapper);
//5.关闭结果集
            this.closeResutlSet(rs);
            //6.关闭语句集
            this.closeStatement(pstm);
            //7.关闭连接
            this.closeConnection(conn);
            //返回查询结果
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    protected void closeConnection(Connection conn) throws SQLException {
        //可以做成数据库连接池，
        conn.close();
    }

    protected void closeStatement(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }

    protected void closeResutlSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    protected  List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws SQLException {
        List<Object> result = new ArrayList<>();
        int rowNum = 1; //初始化游标（行号）
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    protected  ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i=0;i<values.length;i++){
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }

    protected PreparedStatement createPreparedStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    public Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }


}
