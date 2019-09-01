package com.gupaoedu.vip.pattern.proxy.dbroute;

import com.gupaoedu.vip.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.util.Date;

public class DbRouterProxyTest {
    public static void main(String[] args)  {
        Order order = new Order();
        order.setCreateTime(new Date().getTime());

       /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2017/07/02");
        order.setCreateTime(date.getTime());*/

        //使用静态代理
       /* IorderService orderService = new OrderServiceStaticProxy(new OrderService() );
        orderService.createOrder(order);*/

       //使用动态代理
        OrderService target = new OrderService();//被代理的目标对象
        IorderService orderService = (IorderService)new OrderServiceDynamicProxy().getInstance(target);
        orderService.createOrder(order);


    }
}
