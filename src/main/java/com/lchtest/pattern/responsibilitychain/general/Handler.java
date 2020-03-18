package com.lchtest.pattern.responsibilitychain.general;

public abstract class Handler {
    protected Handler nextHandler;
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    abstract void handleRequest(String request);
}
