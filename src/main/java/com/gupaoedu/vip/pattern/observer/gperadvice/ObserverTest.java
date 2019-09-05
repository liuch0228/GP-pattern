package com.gupaoedu.vip.pattern.observer.gperadvice;

public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");
        Question question = new Question();
        question.setUserName("李名");
        question.setContent("观察者模式适用于哪些场景?");
        gPer.addObserver(tom);
        gPer.addObserver(mic);
        gPer.publishQuestion(question);
        //通知老师
//        gPer.addObserver(tom);  发布之后@老师,不起作用,要在发布问题之前@老师


    }
}
