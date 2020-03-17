package com.gupaoedu.vip.pattern.birdge;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCBridge {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "lchadmin");
            String sql = "select * from user where id= ?";
            PreparedStatement pstmt = connection.prepareStatement(sql); // 预编译sql
            pstmt.setInt(1, 1);  // 参数下标1，参数值1
            pstmt.execute(); // 执行查询
            ResultSet rs = pstmt.getResultSet(); // 获取结果集
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setAge(rs.getInt("age"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                System.out.println(user.toString()); //User(id=1, username=lisi, password=12345, age=19)
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

@Data
class User {
    private  int id;
    private String username;
    private  String password;
    private int age;

}
/*CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4*/