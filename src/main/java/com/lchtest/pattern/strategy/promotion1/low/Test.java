package com.lchtest.pattern.strategy.promotion1.low;

public class Test {
    public static void main(String[] args) {
        String promotionType = "COUPON";
        IPromotionStrategy strategy = null;

        if ("COUPON".equals(promotionType)) {
            strategy = new CouponStrategy();
        } else if("GROUPBUY".equals(promotionType)){
            strategy = new GroupBuyStrategy();
        }
        PromotionActivity promotionActivity = new PromotionActivity(strategy);
        promotionActivity.executePromotion();
    }
}
