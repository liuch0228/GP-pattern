package com.gupaoedu.vip.pattern.strategy.promotion;

public class GroupBuyStrategy implements PromotionStrategy {


    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受拼团价");
    }
}
