package com.gupaoedu.vip.pattern.birdge.message;

public interface IMessage {
    // 发送消息：消息内容和接收者
    void send(String msg, String reciever);
}
