package com.lchtest.pattern.singleton.lazy;

public class LazyInnerClassSingleton {
    /**
     * 即便使用了静态内部类,调用者仍可以通过反射机制以及序列化和反序列化来暴力 破坏单例,这里需要加判断来阻止
     */
    private LazyInnerClassSingleton(){
       if (LazyHolder.LAZY != null){
            throw  new RuntimeException("不允构建多个实例!");
        }

    }

    /**
     * 利用内部类的特性,JVM底层 的执行逻辑,避免了线程安全问题
     * LazyHolder里面的逻辑需要等到外部方法调用时才执行,
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static  class  LazyHolder{
        private  static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
