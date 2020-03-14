package com.lchtest.singleton.register;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("main-end");  //加断点
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        Object singleton = ContainerSingleton.getInstance("com.lchtest.singleton.register.Pojo");
        System.out.println(Thread.currentThread().getName() + "-singleton=" + singleton); //加断点

    }
}