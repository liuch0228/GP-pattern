package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.vip.pattern.proxy.Person;

public class Girl  implements Person {
    @Override
    public void findLove() {
        System.out.println("女孩找对象，要求：高富帅，身高180");

    }
}
