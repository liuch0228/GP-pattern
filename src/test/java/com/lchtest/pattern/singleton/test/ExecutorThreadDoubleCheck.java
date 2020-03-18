package com.lchtest.pattern.singleton.test;

import com.lchtest.pattern.singleton.lazy.LazyDoubleCheckSingleton;

public class ExecutorThreadDoubleCheck implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton =  LazyDoubleCheckSingleton.getInstance(); //在这里 加断点
        System.out.println(Thread.currentThread().getName() + singleton);
    }
}
