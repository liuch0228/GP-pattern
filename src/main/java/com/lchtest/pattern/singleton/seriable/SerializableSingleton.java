package com.lchtest.pattern.singleton.seriable;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton INSTANCE = new SerializableSingleton();//饿汉式单例

    private SerializableSingleton(){

    }

    public static  SerializableSingleton getInstance(){
        return INSTANCE;
    }

    //重写readResolve()方法只不过是覆盖了反序列号出来的对象
    //还是创建了2次，发生在JVM层面，相对来说比较安全，
    //之前反序列化出来的对象会被GC
    private Object readResolve(){
        return INSTANCE;
    }

}
