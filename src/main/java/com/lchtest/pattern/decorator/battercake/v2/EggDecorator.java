package com.lchtest.pattern.decorator.battercake.v2;

/**
 * 加鸡蛋的包装器类
 */
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int price() {
        return super.price() + 1;
    }
}
