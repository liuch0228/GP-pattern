package com.lchtest.pattern.strategy.promotion1;

public class Test {
    public static void main(String[] args) {
        Integer promotionType = 0;
        IPromotionStrategy strategy = null;

       /* if ("团购".equals(promotionType)) {
            strategy = new CouponStrategy();
        } else if ("".equals(promotionType)) {
            strategy = new EmptyStrategy();
        }*/
        /*通常写法是通过if-else来选择具体的优惠策略，可以通过一个策略工厂来消除这个if判断
         * 策略工厂提供一个用户可选的key,用户根据传入的key可以获取对应的具体的优惠策略，*/
//        strategy = PromotionFactory.getPromotionStrategy(null);
        strategy = PromotionFactory.getPromotionStrategy(PromotionFactory.PromotionKey.COUPON);
        PromotionActivity activity = new PromotionActivity(strategy);
        activity.executePromotion();

//        Comparator
//        Arrays.sort();
//        Arrays.sort();
//        TreeMap

    }
}
