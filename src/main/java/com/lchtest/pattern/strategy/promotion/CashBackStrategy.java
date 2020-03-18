package com.lchtest.pattern.strategy.promotion;

/**
 * 具体策略类  返现促销
 */
public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额转到支付宝账号");
    }
}
