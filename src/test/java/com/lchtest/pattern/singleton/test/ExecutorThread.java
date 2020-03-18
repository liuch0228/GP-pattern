package com.lchtest.pattern.singleton.test;

import com.lchtest.pattern.singleton.lazy.LazySimpleSingleton;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton singleton =  LazySimpleSingleton.getInstance(); //在这里 加断点
        System.out.println(Thread.currentThread().getName() + singleton);
    }
}
