package com.gupaoedu.vip.pattern.template.jdbc.dao;

import com.gupaoedu.vip.pattern.template.jdbc.JdbcTemplate;
import com.gupaoedu.vip.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }
    
    public List<?> selectAll(){
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) {
                Member member = new Member();
                //如果字段过多,可以使用原型模式
                member.setUserName("tom");
                member.setPassword("12345");
                member.setAddr("北京市海淀区");
//                member.setAddr(rs.getString("addr"));
              //  member.setAge(rs.getInt("age"));  把数据库字段的值映射到pojo属性
                return member;
            }
        },null);
    }
}
