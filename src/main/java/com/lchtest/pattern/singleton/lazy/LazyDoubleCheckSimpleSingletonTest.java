package com.lchtest.pattern.singleton.lazy;

public class LazyDoubleCheckSimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThreadDoubleCheck());
        Thread t2 = new Thread(new ExecutorThreadDoubleCheck());
        t1.start();
        t2.start();
        System.out.println("Executor end"); //此处加断点
    }
}

class ExecutorThreadDoubleCheck implements Runnable {

    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance(); //在这里 加断点
        System.out.println(Thread.currentThread().getName() + singleton);
    }
}
