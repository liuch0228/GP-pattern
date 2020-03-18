package com.lchtest.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonReflectTest {
    public static void main(String[] args) throws Exception {

        Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;
        Constructor<LazyInnerClassSingleton> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true); //强制访问
        LazyInnerClassSingleton o1 = c.newInstance();
        LazyInnerClassSingleton o2 = c.newInstance();
//        LazyInnerClassSingleton o2 = LazyInnerClassSingleton.getInstance();
        System.out.println(o1 == o2); //结果为false ,,说明单例被破坏,实例化了两次

    }

}
