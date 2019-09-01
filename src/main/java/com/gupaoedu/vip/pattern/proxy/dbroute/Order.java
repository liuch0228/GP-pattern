package com.gupaoedu.vip.pattern.proxy.dbroute;

public class Order {
    private Object orderInfo;
    //现在假设需要根据订单的时间按年进行分库
    private  Long createTime;
    private  String id;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
