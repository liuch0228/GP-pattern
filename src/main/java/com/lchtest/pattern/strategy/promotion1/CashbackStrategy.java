package com.lchtest.pattern.strategy.promotion1;

public class CashbackStrategy implements IPromotionStrategy  {
    @Override
    public void doPromotion() {
        System.out.println("返现，打款到支付宝账户");
    }
}
