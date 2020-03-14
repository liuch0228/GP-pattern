package com.lchtest.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();
    private static Object lock = new byte[0];

    private ContainerSingleton() {
    }
    public static Object getInstance(String className) {
        Object instance = null;
        synchronized (lock){
            if (!ioc.containsKey(className)) {  //加断点
                try {
                    instance = Class.forName(className).newInstance();
                    ioc.put(className, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return instance;
            } else {
                return ioc.get(className);
            }
        }
    }

}
