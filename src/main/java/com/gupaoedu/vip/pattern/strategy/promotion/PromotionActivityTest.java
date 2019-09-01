package com.gupaoedu.vip.pattern.strategy.promotion;

public class PromotionActivityTest {
    public static void main(String[] args) {
//1.现实中代码不会这么写
      /*  //618优惠券促销  new CouponStrategy() 策略的选择,交给了用户
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
         //双十一返现促销
        PromotionActivity activityDouble11 = new PromotionActivity(new CashBackStrategy());
        activity618.execute();
        activityDouble11.execute();*/


      //2.改进版: 前台传递参数,后台根据参数,选 择不同的策略:各种if判断
       /* PromotionActivity  promotionActivity= null;
        String promotionKey = "COUPON";
        if (StringUtils.equals(promotionKey,"COUPON")){
            promotionActivity = new PromotionActivity(new CouponStrategy());

        } else if (StringUtils.equals(promotionKey, "CASHBACK")){
            promotionActivity = new PromotionActivity(new CashBackStrategy());
        } else if(StringUtils.equals(promotionKey, "GROUPBUY")){
            promotionActivity = new PromotionActivity(new GroupBuyStrategy());
        }
         promotionActivity.execute();
*/
       //3.使用工厂模式+注册式单例优化
       String promotionKey = "GROUPBUY";
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getProtomotion(promotionKey);
        PromotionActivity activity = new PromotionActivity(promotionStrategy);
        activity.execute();
    }
}
