package com.lchtest.pattern.decorator.battercake.v1;

/**
 *
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        //普通 的煎饼
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价格: "+ battercake.price());
        //加了鸡蛋的煎饼
        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价格: "+ battercakeWithEgg.price());
        //加了鸡蛋和香肠的煎饼
        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + ",总价格: "+ battercakeWithEggAndSausage.price());



    }
}
