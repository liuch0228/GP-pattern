package com.gupaoedu.vip.pattern.strategy.promotion1.low;

/**
 * 上下文-促销活动方案
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy promotionStrategy) {
        this.strategy = promotionStrategy;
    }

    public void executePromotion() {
        this.strategy.doPromotion();
    }
}
