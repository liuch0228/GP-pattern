package com.lchtest.pattern.delegate.general;

public class ConcreteTaskA implements Task {
    @Override
    public void doTask() {
        System.out.println("执行 task A");
    }
}
