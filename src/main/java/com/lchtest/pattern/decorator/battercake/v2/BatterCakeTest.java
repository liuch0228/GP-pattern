package com.lchtest.pattern.decorator.battercake.v2;

import org.springframework.cache.transaction.TransactionAwareCacheDecorator;
import org.springframework.http.server.reactive.HttpHeadResponseDecorator;

public class BatterCakeTest {
    public static void main(String[] args) {
        Battercake battercake;
        //买一个最基本的煎饼
        battercake  = new BaseBattercake();
        //加一个鸡蛋的煎饼
        battercake = new EggDecorator(battercake);
        //再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //再加一个香肠
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + ",总价格：" + battercake.price());

        TransactionAwareCacheDecorator cacheDecorator;
        HttpHeadResponseDecorator responseDecorator;
    }
}
