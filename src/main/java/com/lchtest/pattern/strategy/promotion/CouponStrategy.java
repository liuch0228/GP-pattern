package com.lchtest.pattern.strategy.promotion;

/***
 * 具体策略类 优惠券
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格直接减去优惠券面值抵扣");
    }
}
