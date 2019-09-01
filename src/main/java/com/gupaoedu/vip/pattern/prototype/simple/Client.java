package com.gupaoedu.vip.pattern.prototype.simple;

/**
 * 3.访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 */
public class Client {

    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }
}
