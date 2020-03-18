package com.lchtest.pattern.strategy.promotion;

/**
 * 具体策略类：  无优惠
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("没有促销活动");
    }
}
