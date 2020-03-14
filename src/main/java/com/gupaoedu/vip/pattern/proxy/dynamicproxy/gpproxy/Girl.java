package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;

public class Girl implements Person {
    @Override
    public void findLove(int salary) {
        System.out.println("女孩找对象，要求：高富帅，身高180,年薪大于" + salary + "万.");

    }


}
