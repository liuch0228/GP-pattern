package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.vip.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * 1.实现InvocationHandler这个接口
 * 2.必须持有真实对象的引用
 */
public class JDKMeiPo implements InvocationHandler {

    private Person target;
//获取动态代理对象
    public Object getInstance(Person person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(), this);

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，现在已经确认你的需求");
        System.out.println("开始物色对象");
    }
    private void after(){
        System.out.println("ok的话，准备办事");
    }
}
