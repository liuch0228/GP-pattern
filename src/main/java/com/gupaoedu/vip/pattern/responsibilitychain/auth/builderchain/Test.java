package com.gupaoedu.vip.pattern.responsibilitychain.auth.builderchain;

public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("jack", "123");

        //
//        Filter
        //javax.servlet.Filter.doFilter 的入参FilterChain就是一个过滤器链
    }
}
