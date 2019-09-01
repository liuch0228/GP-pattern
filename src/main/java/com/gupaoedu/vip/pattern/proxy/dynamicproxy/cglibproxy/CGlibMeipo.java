package com.gupaoedu.vip.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib实现动态代理,要使用MethodInterceptor,必须添加cglib-nodep-2.2.jar依赖
 */
public class CGlibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer  = new Enhancer();
        //设置要继承的父类为传递过来的这个类
        enhancer.setSuperclass(clazz);
        //设置要回调的方法为该类的intercept方法
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    //在intercept方法里面进行增强
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        //生成的类是子类,在增强之前,要先去调用父类的一些方法
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }

    private void before(){
        System.out.println("增强之前:");
        System.out.println("我是媒婆，现在已经确认你的需求");
        System.out.println("开始物色对象");
    }
    private void after(){

        System.out.println("增强之后:");
        System.out.println("ok的话，准备办事");
    }
}
