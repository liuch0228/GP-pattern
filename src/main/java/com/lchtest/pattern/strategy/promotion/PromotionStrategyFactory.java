package com.lchtest.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂 使用注册式单例来完成
 */
public class PromotionStrategyFactory {

   private static Map<String,PromotionStrategy> PROMOTION_STATEGY_MAP = new HashMap<>();

   static {
       PROMOTION_STATEGY_MAP.put(PromotionKey.DEFAULT,new EmptyStrategy());
       PROMOTION_STATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
       PROMOTION_STATEGY_MAP.put(PromotionKey.CASHBACK,new CashBackStrategy());
       PROMOTION_STATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupBuyStrategy());
   }

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getProtomotion(String promotionKey){
        return  PROMOTION_STATEGY_MAP.get(promotionKey);

    }
    private interface PromotionKey{
       String COUPON = "COUPON";
       String CASHBACK = "CAHSBACK";
       String GROUPBUY = "GROUPBUY";
       String DEFAULT = "EMPTY";
    }

}
