package com.lchtest.pattern.singleton.test;

import com.lchtest.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 静态内部类实现单例
 */
public class LazyInnerClassSingletonReflectTest {
    public static void main(String[] args) throws Exception {

        Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;
        Constructor<LazyInnerClassSingleton> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true); //强制访问
        LazyInnerClassSingleton o1 = c.newInstance();
//        LazyDoubleCheckSingleton o2 = c.newInstance();
        LazyInnerClassSingleton o2 = LazyInnerClassSingleton.getInstance();
        System.out.println(o1 == o2); //结果为false ,,说明单例被破坏,实例化了两次
        /*LazyInnerClassSingleton 构造器中添加如下判断,阻止单例被反射破坏
        *  if (LazyHolder.LAZY != null){
            throw  new RuntimeException("不允许实例化多个对象!");
        }
        *  当被反射实例化时，直接报错
        * Exception in thread "main" java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at com.gupaoedu.vip.pattern.singleton.test.LazyInnerClassSingletonReflectTest.main(LazyInnerClassSingletonReflectTest.java:16)
Caused by: java.lang.RuntimeException: 不允构建多个实例!
	at com.gupaoedu.vip.pattern.singleton.lazy.LazyInnerClassSingleton.<init>(LazyInnerClassSingleton.java:9)
	... 5 more
        * */
    }
}
