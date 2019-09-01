package com.gupaoedu.vip.pattern.proxy.dbroute.proxy;

import com.gupaoedu.vip.pattern.proxy.dbroute.IorderService;
import com.gupaoedu.vip.pattern.proxy.dbroute.Order;
import com.gupaoedu.vip.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IorderService {
    private IorderService orderService;
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    public OrderServiceStaticProxy(IorderService orderService){
        this.orderService = orderService;
    }
    @Override
    public int createOrder(Order order) {

        //在创建订单之前，要根据订单时间进行换算，选择要存储的库
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("分配到DB_"+dbRouter + "数据源处理");
        DynamicDataSourceEntity.set(dbRouter);
        int result = this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return result;
    }
}
