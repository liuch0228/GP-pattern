package com.lchtest.pattern.singleton.hungry;

/**
 * 饿汉式单例模式三要素
 * 1.构造方法私有
 * 2.静态的获取单例的方法
 * 3.实例在类加载还未被初始化的时候就创建了  private static final
 * 写在静态块里面也可以
 * 缺点:不管用不用,都实例化,会浪费内存空间===>改进:懒汉式单例
 */
public class HungrySingleton {

//    private static final HungrySingleton  hungrySingleton= new HungrySingleton();
    private static final HungrySingleton hungrySingleton;
    static {
        hungrySingleton= new HungrySingleton();
    }
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
