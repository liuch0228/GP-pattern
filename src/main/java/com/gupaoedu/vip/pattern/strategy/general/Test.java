package com.gupaoedu.vip.pattern.strategy.general;

public class Test {
    public static void main(String[] args) {
        // 选择一个具体策略
       IStrategy strategy = new ConcreteStrategyA();
       // 上下文环境
       Context context = new Context(strategy);
       // 客户端直接让上下文环境执行算法；
       context.algorithim();
    }
}