package com.gupaoedu.vip.pattern.flyweight.general;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂
 * 初始化时会预先创建一部分对象缓存起来，使用享元对象时从缓存中去取，用完之后，享元对象归还到缓存中，而不是被GC
 */
public class FlyweightFactory {
    private static Map<String,IFlyweight>  pool = new ConcurrentHashMap<>();
    // 因为内部状态具备不变性，因此可以作为缓存的key
    public static IFlyweight getFlyweight(String intrinsicState){
        if(!pool.containsKey(intrinsicState)){
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
