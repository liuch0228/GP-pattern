package com.lchtest.pattern.singleton.test;

import com.lchtest.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
                System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
            }
        });
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();



    }
}
