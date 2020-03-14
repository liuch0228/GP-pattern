package com.gupaoedu.vip.pattern.singleton.threadlocal;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
    }
}

class ExecutorThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
    }
}