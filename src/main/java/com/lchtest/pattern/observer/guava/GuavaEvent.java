package com.lchtest.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * guava实现监听者模式
 */
public class GuavaEvent {

    //
    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法,传入的参数是:" + str);
    }
}
