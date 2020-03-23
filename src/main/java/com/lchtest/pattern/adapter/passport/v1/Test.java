package com.lchtest.pattern.adapter.passport.v1;

public class Test {
    public static void main(String[] args) {
        PassportAdapter adapter = new PassportAdapter();
        // 通过适配器使用老功能
        ResultMsg loginByPasswd = adapter.login("admin", "1234");
        ResultMsg loginByWeibo = adapter.loginForWeibo("sadddfgdghh");
        System.out.println(loginByPasswd);
        System.out.println(loginByWeibo);
    }
}
