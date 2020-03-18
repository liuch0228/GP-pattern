package com.lchtest.pattern.birdge.message;

public class SystemMessage implements IMessage {
    @Override
    public void send(String msg, String reciever) {
        System.out.println(String.format("使用内部消息系统发送消息 %s 给 %s ", msg, reciever));
    }
}
