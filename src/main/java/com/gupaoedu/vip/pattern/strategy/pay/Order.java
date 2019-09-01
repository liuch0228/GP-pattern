package com.gupaoedu.vip.pattern.strategy.pay;

import com.gupaoedu.vip.pattern.strategy.pay.payport.PayStrategy;
import com.gupaoedu.vip.pattern.strategy.pay.payport.Payment;

import java.util.Comparator;

public class Order {
    private String uid;
    private String orderId;
    private  Double amount;

    public Order(String uid, String orderId, Double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    /**
     *
     * @param payType 支付方式,由用户选择
     * @return 支付状态
     */
    public MessageResult pay(String payType){
        //获取具体的支付策略
        Payment payment = PayStrategy.getPayStrategy(payType);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为:" + amount + ",开始扣款...");
        return payment.pay(uid,amount)   ;


    }



}