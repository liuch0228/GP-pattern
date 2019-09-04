package com.gupaoedu.vip.pattern.decorator.passort.upgrade;

import com.gupaoedu.vip.pattern.decorator.passort.old.SinginService;

public class DecoratorTest {
    public static void main(String[] args) {
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SinginService());
        siginForThirdService.loginForQQ("sfasdsdagg");
    }
}
