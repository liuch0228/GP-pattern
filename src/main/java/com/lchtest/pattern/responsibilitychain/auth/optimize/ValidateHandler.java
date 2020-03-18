package com.lchtest.pattern.responsibilitychain.auth.optimize;

import com.lchtest.pattern.responsibilitychain.auth.Member;
import org.apache.commons.lang.StringUtils;

public class ValidateHandler extends  Handler {
    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getLoginPass())) {
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("ValidateHandler check ok! 用户名和密码不为空，可以往下执行");

        // 让下一个handler执行
        nextHandler.doHandler(member);
    }
}
