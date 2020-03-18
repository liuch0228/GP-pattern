package com.lchtest.pattern.flyweight.ticket;

import java.security.SecureRandom;

/**
 * 具体享元角色；实现抽象享元角色中规定的接口
 */
public class TrainTicket implements ITicket {
    // 票的出发地
    private String from;
    // 票的目的地
    private String to;
    // 票的价格
    private int price;

    // 出发地和目的地为外部输入,是外部状态
    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * 外部状态
     * @param bunk 座位席别
     */
    public void showInfo(String bunk) {
        // 票价属于由系统内部生成 ，这里用随机数模拟
        this.price = new SecureRandom().nextInt(500);
        // 票的具体信息
        System.out.println(String.format("%s -> %s  %s价格：%s 元", from, to, bunk, price));
    }
}
