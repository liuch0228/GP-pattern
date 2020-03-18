package com.lchtest.pattern.decorator.battercake.v1;

/**
 * 加鸡蛋和香肠的煎饼  这种写法的缺点：如果要继续添加功能，那么类也要增加了
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    public String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    public int price() {
        return super.price() + 3;
    }
}
