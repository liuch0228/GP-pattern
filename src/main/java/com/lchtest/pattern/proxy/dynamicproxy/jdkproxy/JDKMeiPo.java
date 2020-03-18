package com.lchtest.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.*;

/**
 * 动态代理类
 * 1.实现InvocationHandler这个接口
 * 2.必须持有真实对象的引用
 */
public class JDKMeiPo implements InvocationHandler {

    private Person target;

    //获取动态代理对象
    public Object getInstance(Person person) {
        this.target = person;
        Class<?> clazz = target.getClass();
        Object obj = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return obj;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
      /*  Type[] paramTypeList = method.getGenericParameterTypes();// 方法的参数列表
        Type type = paramTypeList[0];
        System.out.println(type);*/
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆，现在已经确认你的需求");
        System.out.println("开始物色对象");
    }

    private void after() {
        System.out.println("ok的话，准备办事");
    }
}
