package com.lchtest.pattern.responsibilitychain.auth.optimize;

import com.lchtest.pattern.responsibilitychain.auth.Member;

public class LoginStateValidateHandler extends Handler {
    @Override
    public void validate(Member member) {
        System.out.println("LoginStateValidateHandler check ok! 登录成功！");
        member.setRoleName("管理员");
        nextHandler.validate(member);
    }
}
