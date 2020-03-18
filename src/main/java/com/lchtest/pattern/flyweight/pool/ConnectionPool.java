package com.lchtest.pattern.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * 享元工厂  Connection是抽象享元角色，jdk已实现
 */
public class ConnectionPool {
    private Vector<Connection> pool;  // 抽象享元角色就是Connection接口，jdk已定义
    /* 每个享元对象都相同的部分，是享元对象的内部状态；
     这里连接池中的每个连接的 url  username password driverClassName属性都是固定不变的
      ，因此这些属性是享元对象的内部状态；
      而什么时候释放连接并回收享元对象，是由外部因素来决定的，属于享元对象的外部状态*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 100;

    public ConnectionPool() {
        pool = new Vector<>(poolSize);

        try {
            Class.forName(driverClassName);
            for (int i = 0; i < poolSize; i++) {
                Connection connection = DriverManager.getConnection(url,username,password);
                // 初始化连接池
                pool.add(connection);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // 获取一个连接
    public synchronized Connection getConnection(){
        if(pool.size() > 0){
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }
        return null;
    }


    // 释放连接，将连接对象归还到连接池对象中
    public synchronized void releaseConnection(Connection connection){
        pool.add(connection);
    }
}
