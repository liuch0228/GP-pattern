package com.gupaoedu.vip.pattern.softwaredesign.rule.openclosedprinciple;

/**
 * 现在我们要给 Java架构课程做活动，价格优惠。如果修改 JavaCourse 中的 getPrice()方法，则会存在一定的风险，可能影响其他地方的调用结果。
 * 如何在不修改原有代码前提前下，实现价格优惠这个功能呢,再写一个处理优惠逻辑的类，JavaDiscountCourse 类继承原来的类即可
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    // 提供原有的功能：获取最初价格
    public Double getOriginPrice() {
        return super.getPrice();
    }

    /**
     * 折扣价格
     * @param discount
     * @return
     */
    public Double getPrice(Double discount) {
        return super.getPrice() * discount;
    }

}
