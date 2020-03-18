package com.lchtest.pattern.proxy.dbroute.db;

/**
 * 模拟数据源动态切换
 */
public class DynamicDataSourceEntity {
    public static final String DEFAULT_SOURCE = null;
//线程内部单例
     private final static ThreadLocal<String> local = new ThreadLocal<>();

     private DynamicDataSourceEntity(){}

     private static String get(){
         return local.get();
     }

     public  static void set(String source){
         local.set(source);
     }

    public  static void set(int  year){
        local.set("DB_"+year);
    }

    public static void restore(){
         local.set(DEFAULT_SOURCE);
    }

}
