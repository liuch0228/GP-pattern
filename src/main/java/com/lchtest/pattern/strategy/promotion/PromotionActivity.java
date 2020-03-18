package com.lchtest.pattern.strategy.promotion;

/**
 * 发布促销活动
 */
public class PromotionActivity {
    PromotionStrategy promotionStrategy ;

    public  PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }
}
