package com.lchtest.pattern.responsibilitychain.general;

public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        // 设置调用链关系
        handlerA.setNextHandler(handlerB);
        // ConcreteHandlerA处理不了requestB,交给ConcreteHandlerB处理
        handlerA.handleRequest("requestB");
    }
}
