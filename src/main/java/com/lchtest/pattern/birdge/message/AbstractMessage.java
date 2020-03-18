package com.lchtest.pattern.birdge.message;

public abstract class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    void send(String msg, String reciever){
        this.message.send(msg, reciever);
    }

}
