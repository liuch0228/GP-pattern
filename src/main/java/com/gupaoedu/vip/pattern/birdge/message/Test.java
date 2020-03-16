package com.gupaoedu.vip.pattern.birdge.message;

public class Test {
    public static void main(String[] args) {
        IMessage message = new EmailMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.send("便携式测温仪采购申请","采购经理");

        message = new SystemMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.send("便携式测温仪采购申请","公司老板");

    }
}
