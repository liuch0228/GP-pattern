package com.gupaoedu.vip.pattern.singleton.lazy;

public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        new Thread(new ExexutorThread()).start();
        new Thread(new ExexutorThread()).start();

    }
}

class ExexutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);
    }
}
