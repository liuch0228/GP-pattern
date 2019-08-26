package com.gupaoedu.vip.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton  {
    //加上volatile关键字,保证线程可见性
    private /*volatile*/ static  LazyDoubleCheckSingleton lazy;

    private LazyDoubleCheckSingleton(){}


    //加synchronized关键字可以解决线程安全问题,但是会带来2个问题,1:性能问题,2 synchronized有可能会锁住整个LazySimpleSingleton类,甚至导致死锁

    //解决办法:使用双重加锁检查机制
    /*public synchronized static LazyDoubleCheckSingleton getInstance(){
        if(null == lazy) { //在这里加断点调试
            lazy = new LazyDoubleCheckSingleton();
        }
        return lazy;
    }*/

    //synchronized是一种类锁,在这里把加锁放到if里面去
    public  static LazyDoubleCheckSingleton getInstance(){
        if(null == lazy) { //在这里加断点调试
            synchronized(LazyDoubleCheckSingleton.class){
                if(null == lazy) { //这里如果不加判断,第二个线程还是会有可能再new一次对象
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

}
