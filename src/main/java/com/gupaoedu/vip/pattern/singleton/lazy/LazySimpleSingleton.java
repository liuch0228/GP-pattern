package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * 1.构造方法私有化
 * 2.提供全局访问点
 */
public class LazySimpleSingleton {
    private  static  LazySimpleSingleton lazy;

    private LazySimpleSingleton(){}

    /*public static LazySimpleSingleton getInstance(){
        if(null == lazy) { //在这里加断点调试
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }*/
    //加synchronized关键字可以解决线程安全问题,但是会带来2个问题,1:性能问题,2 synchronized有可能会锁住整个LazySimpleSingleton类,甚至导致死锁
    //解决办法:使用双重加锁检查机制
    public synchronized static LazySimpleSingleton getInstance(){
        if(null == lazy) { //在这里加断点调试
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
