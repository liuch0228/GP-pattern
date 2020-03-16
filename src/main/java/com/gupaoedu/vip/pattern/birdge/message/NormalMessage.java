package com.gupaoedu.vip.pattern.birdge.message;

public class NormalMessage extends AbstractMessage {
    public NormalMessage(IMessage message) {
        super(message);
    }

    @Override
    void send(String msg, String reciever) {
        // 普通消息，直接调用父类方法发送消息
        super.send(msg, reciever);
    }
}
