package com.gupaoedu.vip.pattern.strategy.promotion1;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂，使用注册式单例
 */
public class PromotionFactory {
    /**
     * 通过容器保存所有的具体的优惠策略
     */
    private static Map<Integer, IPromotionStrategy> PROMOTIONS = new HashMap<>();

    static {
        PROMOTIONS.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY, new GroupBuyStrategy());
    }

    private static final IPromotionStrategy DEFAULT_EMPTY = new EmptyStrategy();

    private PromotionFactory() {
    }

    /**
     *
     * @param promotionKey 用户传递的参数
     * @return 对应的具体优惠策略
     */
    public static IPromotionStrategy getPromotionStrategy(Integer promotionKey) {
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy != null ? strategy : DEFAULT_EMPTY;
    }

    /**
     * 具体策略对应的key,前端传入
     */
    public interface PromotionKey {
        Integer COUPON = 1;
        Integer CASHBACK = 2;
        Integer GROUPBUY = 3;
    }
}
