package com.lchtest.pattern.strategy.pay;

import com.lchtest.pattern.strategy.pay.payport.PayStrategy;

public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1","2019031300000", 324.5);
        //这里order.pay的入参模拟页面传递进来的数据(支付页面上点击的支付按钮的值)
        MessageResult result = order.pay(PayStrategy.JD_PAY);
        System.out.println(result);

    }


}
