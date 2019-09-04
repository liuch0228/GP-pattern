package com.gupaoedu.vip.pattern.decorator.battercake.v2;

/**
 * 煎饼的包装器的抽象，无论怎么包装，本质都是一个煎饼！！！
 */
public abstract class BattercakeDecorator extends Battercake {
    //被包装的对象的引用
    private Battercake battercake;
    //把被包装的对象 以构造方法的方式传递进来
    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int price() {
        return this.battercake.price();
    }
}
