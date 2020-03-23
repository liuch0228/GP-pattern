package com.lchtest.pattern.delegate.general;

import java.util.Random;

public class Delegate implements Task {
    @Override
    public void doTask() {
        System.out.println("代理执行task");
        Task task = null;
        if (new Random().nextBoolean()) {
            task = new ConcreteTaskA();
        } else {
            task = new ConcreteTaskB();
        }
        task.doTask();
        System.out.println("代理执行task结束");
    }
}
