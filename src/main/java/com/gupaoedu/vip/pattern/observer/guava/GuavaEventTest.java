package com.gupaoedu.vip.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import org.springframework.web.context.ContextLoaderListener;

public class GuavaEventTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("Tom");
        //guava面向的是方法

        //观察者模式在spring中的应用 spring中以Listener 结尾的基本都是观察者模式
        ContextLoaderListener listener;
        //org.springframework.web.context.ContextLoader.initWebApplicationContext



    }
}
