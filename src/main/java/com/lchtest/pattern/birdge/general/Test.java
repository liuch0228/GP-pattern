package com.lchtest.pattern.birdge.general;

public class Test {
    public static void main(String[] args) {
        // 实现化角色
        IImplementor implementor = new ConcreteImplementorA();
        // 抽象化角色
        Abstraction abs = new RefinedAbstraction(implementor);
        // 执行操作
        abs.operation();
    }
}
