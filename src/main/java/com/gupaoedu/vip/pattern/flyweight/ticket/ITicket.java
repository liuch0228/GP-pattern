package com.gupaoedu.vip.pattern.flyweight.ticket;

/**
 * 抽象的享元角色，时所有的具体享元类的基类，为具体享元规范需要实现的公共接口
 * 非享元的外部状态以参数的形式通过方法传入。
 */
public interface ITicket {
    // 显示票的信息，通过传递的参数bunk 来区分不同的票
    void showInfo(String bunk);
}
