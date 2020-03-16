package com.gupaoedu.vip.pattern.responsibilitychain.auth.optimize;

import com.gupaoedu.vip.pattern.responsibilitychain.auth.Member;

public class LoginHandler extends  Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("LoginHandler check ok! 登录成功！");
        member.setRoleName("管理员");
        nextHandler.doHandler(member);
    }
}
