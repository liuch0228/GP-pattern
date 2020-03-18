package com.lchtest.pattern.flyweight.ticket;

public class TicketTest {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京", "南京南");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("北京", "南京南");
        // 再次查询，北京-南京南已经有产生ITicket的实例了，直接从缓存中获取，只是由于座位席别不同，价格也不同了
        ticket.showInfo("硬卧");
        ticket = TicketFactory.queryTicket("北京西", "南京南");
        ticket.showInfo("硬卧");
    }
}
