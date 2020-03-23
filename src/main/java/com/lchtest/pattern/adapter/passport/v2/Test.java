package com.lchtest.pattern.adapter.passport.v2;

public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        ResultMsg result = adapter.loginForQQ("adfagdgdag");
        System.out.println(result);
    }
}
