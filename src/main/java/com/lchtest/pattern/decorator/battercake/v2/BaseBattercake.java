package com.lchtest.pattern.decorator.battercake.v2;

/**
 * 煎饼基础套餐,继承抽象类
 */
public class BaseBattercake extends Battercake{
    public String getMsg(){
        return "煎饼";
    }

    public int price(){
        return 5;
    }
}
