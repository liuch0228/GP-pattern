package com.lchtest.pattern.flyweight.general;

/**
 * 具体享元角色
 * 实际业务中要使用的类，这个类在业务场景中会被反复创建
 * 为了避免每次都去创建对象，这里会使用一个享元工厂来缓存一定数量的对象
 */
public class ConcreteFlyweight implements IFlyweight {
    // 具体享元角色的内部状态，这个状态，是每个具体享元角色都相同的，不随外部的使用而改变的
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("========ConcreteFlyweight.operation() begin ==========");
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("享元角色内部状态: " + this.intrinsicState);
        System.out.println("享元角色外部状态: " + extrinsicState);
        System.out.println("========ConcreteFlyweight.operation()  end  ==========");
    }
}
