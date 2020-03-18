package com.lchtest.pattern.decorator.passort.upgrade;

import com.lchtest.pattern.decorator.passort.old.SinginService;

public class DecoratorTest {
    public static void main(String[] args) {
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SinginService());
        siginForThirdService.loginForQQ("sfasdsdagg");
//        JdbcUtils.closeConnection();
    }
}
