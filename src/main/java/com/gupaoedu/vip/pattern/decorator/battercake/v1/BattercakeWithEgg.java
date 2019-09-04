package com.gupaoedu.vip.pattern.decorator.battercake.v1;

/**
 * 加鸡蛋的煎饼   原始的写法:继承原来的类,重写方法
 *
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int price() {
        return super.price() + 1; //加了鸡蛋,价格变化
    }
}
