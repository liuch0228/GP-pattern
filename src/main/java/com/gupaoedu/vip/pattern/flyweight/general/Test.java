package com.gupaoedu.vip.pattern.flyweight.general;

public class Test {
    public static void main(String[] args) {
        IFlyweight flyweight1 = FlyweightFactory.getFlyweight("内部状态1");
        IFlyweight flyweight2 = FlyweightFactory.getFlyweight("内部状态2");
        flyweight1.operation("外部状态1");
        flyweight2.operation("外部状态2");
    }
}
