package com.lchtest.pattern.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;


public class GPMeiPo implements GPInvocationHandler{

    private Object target;//这里应该是Object,而不是Person private Person target;
    //获取动态代理对象
    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(), this);

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
