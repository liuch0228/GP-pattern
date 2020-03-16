package com.gupaoedu.vip.pattern.birdge.message;

public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    void send(String msg, String reciever) {
        // 加急消息特殊处理
        String urgencyMessage  = "【加急】" + msg;
        super.send(urgencyMessage, reciever);
    }
}
