package com.gupaoedu.vip.pattern.proxy.dbroute.proxy;

import com.gupaoedu.vip.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;


public class OrderServiceDynamicProxy implements InvocationHandler {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    Object proxyObj;

    public Object getInstance(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj = method.invoke(proxyObj, args); //invoke的第一个参数是被代理的真实对象的引用!!!
//        Object obj = method.invoke(proxy, args);  //invoke的参数如果写错成 proxy,则会形成死循环!!!!
        after();
        return obj;
    }

    private void after() {
        System.out.println("Proxy after method");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    //target 应该是订单对象Order
    private void before(Object target) {
        try {
            //进行数据源的切换
            System.out.println("Proxy before method");

            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("动态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
