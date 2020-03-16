package com.gupaoedu.vip.pattern.strategy.promotion1;

public class GroupBuyStrategy implements IPromotionStrategy  {
    @Override
    public void doPromotion() {
        System.out.println("3人团购，每人优惠500");
    }
}
