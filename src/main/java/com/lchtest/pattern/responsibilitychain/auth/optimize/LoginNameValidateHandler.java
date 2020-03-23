package com.lchtest.pattern.responsibilitychain.auth.optimize;

import com.lchtest.pattern.responsibilitychain.auth.Member;
import org.apache.commons.lang.StringUtils;

public class LoginNameValidateHandler extends  Handler {
    @Override
    public void validate(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getLoginPass())) {
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("LoginNameValidateHandler check ok! 用户名和密码不为空，可以往下执行");

        // 让下一个handler执行
        nextHandler.validate(member);
    }
}
