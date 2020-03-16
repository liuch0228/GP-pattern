package com.gupaoedu.vip.pattern.strategy.promotion1;

public class EmptyStrategy implements IPromotionStrategy  {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
