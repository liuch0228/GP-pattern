package com.lchtest.pattern.birdge.message;

public class EmailMessage implements IMessage {
    @Override
    public void send(String msg, String reciever) {
        System.out.println(String.format("使用邮件发送消息 %s 给 %s ", msg, reciever));
    }
}
