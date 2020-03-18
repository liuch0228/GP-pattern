package com.lchtest.pattern.flyweight.ticket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，
 * 享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 */
public class TicketFactory {
    // 用一个map来缓存享元对象，一般命名为xxxPool
    private static Map<String,ITicket> pool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from,String to){
        String key = from + "->" + to;
        // 如果对象已经存在，则直接使用
        if(pool.containsKey(key)){
            pool.put(key,new TrainTicket(from, to));
            System.out.println("使用缓存：" + key);
            return pool.get(key);
        }

        System.out.println("首次查询，创建对象, key= " + key);
        // 创建对象并缓存起来
        ITicket ticket = new TrainTicket(from ,to);
        pool.put(key, ticket);
        return ticket;

    }
}
