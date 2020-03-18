package com.lchtest.pattern.singleton.test;

/**
 * 测试双重加锁检查
 */
public class LazyDoubleCheckSimpleSingletonTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThreadDoubleCheck());
        Thread t2 = new Thread(new ExecutorThreadDoubleCheck());
        t1.start();
        t2.start();
        System.out.println("Executor end"); //此处加断点
    }
}
