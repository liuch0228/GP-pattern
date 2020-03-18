package com.lchtest.pattern.strategy.general;

public class ConcreteStrategyA implements IStrategy {
    @Override
    public void algorithim() {
        System.out.println("执行策略A");
    }
}
