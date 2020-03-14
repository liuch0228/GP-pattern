package com.gupaoedu.vip.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

public class LazyDoubleCheckSingletonReflectTest {
    public static void main(String[] args) throws Exception {
        Class<LazyDoubleCheckSingleton> clazz = LazyDoubleCheckSingleton.class;
        Constructor<LazyDoubleCheckSingleton> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true); //强制访问
        LazyDoubleCheckSingleton o1 = c.newInstance();
        LazyDoubleCheckSingleton o2 = c.newInstance();
//        LazyDoubleCheckSingleton o2 = LazyDoubleCheckSingleton.getInstance();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2); //结果为false ,说明单例被破坏,实例化了两次
    }
}
