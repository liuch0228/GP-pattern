package com.gupaoedu.vip.pattern.responsibilitychain.auth.optimize;

public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("jack", "123");
    }
}
