package com.gupaoedu.vip.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略环境类,保存了策略接口的引用,这里通过注册式单例实现
 */
public class PayStrategy {

    public static final String ALI_PAY = "ALI_PAY";
    public static final String JD_PAY = "JD_PAY";
    public static final String WECHAT_PAY = "WECHAT_PAY";
    public static final String UNIONON_PAY = "UNIONON_PAY";
    public static final String DEFAULT_PAY = "ALI_PAY";

    //保存所有的支付策略(封装支付算法)
    private  static Map<String,Payment> PAY_STRATEGY_MAP = new HashMap<>();
    private PayStrategy(){

    }

    //通过统一入口实现动态策略的选择
    public static Payment getPayStrategy(String key){
        if(PAY_STRATEGY_MAP.containsKey(key)){
            return PAY_STRATEGY_MAP.get(key);
        }
       return PAY_STRATEGY_MAP.get(DEFAULT_PAY);

    }

    //初始化支付策略
    static {
        PAY_STRATEGY_MAP.put(ALI_PAY,new AliPay());
        PAY_STRATEGY_MAP.put(JD_PAY,new JDPay());
        PAY_STRATEGY_MAP.put(WECHAT_PAY,new WechatPay());
        PAY_STRATEGY_MAP.put(UNIONON_PAY,new UnionPay());
    }

}
