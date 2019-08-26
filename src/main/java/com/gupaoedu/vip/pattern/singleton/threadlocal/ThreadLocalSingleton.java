package com.gupaoedu.vip.pattern.singleton.threadlocal;

/**
 *
 * 线程内部线程安全,线程间非线程安全的单例
 * ThreadLocal本身也是注册式单例
 */
public class ThreadLocalSingleton {

    private  static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    public static ThreadLocalSingleton getInstance(){
        return  threadLocalInstance.get();
    }

}
