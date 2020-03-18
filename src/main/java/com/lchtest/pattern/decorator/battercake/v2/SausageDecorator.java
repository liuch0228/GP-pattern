package com.lchtest.pattern.decorator.battercake.v2;

public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个香肠";
    }

    @Override
    protected int price() {
        return super.price() + 3;
    }

    protected void doSomething(){

    }
}
