package com.gupaoedu.vip.pattern.strategy.pay.payport;
/**
 * 具体策略类,实现了抽象策略定义的接口，提供具体的算法实现。
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
