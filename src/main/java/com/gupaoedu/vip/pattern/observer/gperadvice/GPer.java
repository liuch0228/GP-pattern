package com.gupaoedu.vip.pattern.observer.gperadvice;

import java.util.Observable;

/**
 * 观察者模式（Observer Pattern）定义了对象之间的一对多依赖，让多个观察者对象同
 * 时监听一个主体对象，当主体对象发生变化时，它的所有依赖者（观察者）都会收到通
 * 知并更新，属于行为型模式。观察者模式有时也叫做发布订阅模式。观察者模式主要用
 * 于在关联行为之间建立一套触发机制的场景。观察者模式在现实生活应用也非常广泛，
 * 比如：微信朋友圈动态通知、GPser生态圈消息通知、邮件通知、广播通知、桌面程序
 * 的事件响应等
 * JDK提供的实现观察者的方式:继承Observable
 * GPer 在这里是一个被观察者
 */
public class GPer extends Observable {

    private String name = "Gper生态圈";
    private static GPer gper = null;

    private GPer() {
    }


    public static GPer getInstance() {
        if (null == gper) {
            gper = new GPer();
        }
        return gper;
    }
    public String getName(){
        return name;
    }
    public void  publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + name + "提交了一个问题");
        setChanged();
        notifyObservers(question);

    }
}
