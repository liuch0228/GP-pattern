package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

public class Girl implements Person {
    @Override
    public void findLove(int age) {
        System.out.println("女孩找对象，要求：高富帅，身高180,年龄大于" + age + "岁.");

    }
}
