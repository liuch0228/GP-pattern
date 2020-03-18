package com.lchtest.pattern.responsibilitychain.auth.builderchain;

import com.lchtest.pattern.responsibilitychain.auth.Member;

public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("LoginHandler check ok! 登录成功！");
        member.setRoleName("管理员");
//        member.setRoleName("游客");
        nextHandler.doHandler(member);
    }
}
