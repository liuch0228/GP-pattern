package com.gupaoedu.vip.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * teacher是一个观察者:一个学生提出问题,所有老师都能接收到这个问题
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gper = (GPer) o;
        Question question = (Question) arg;
        System.out.println("==============================");
        System.out.println(name + "老师,你好!\n"
                + "您收到了一个来自' " + gper.getName() + "'的提问,希望能够解答,问题内容如下:\n " +
                question.getContent() + "提问者是:" + question.getUserName());


    }
}
