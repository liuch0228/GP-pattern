package com.gupaoedu.vip.pattern.strategy.pay.payport;

import com.gupaoedu.vip.pattern.strategy.pay.MessageResult;

/**
 * 抽象策略类
 * 定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，
 * 环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 */
public abstract class Payment {

    // 支付方式
    public abstract String getName();

    // 通用逻辑放到抽象类里面（模板方法模式）
    protected abstract double queryBalance(String uid);

    public MessageResult pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new MessageResult(500, "支付失败", "余额不足");

        }
        return new MessageResult(200, "支付成功", "支付金额:" + amount);
    }
}
