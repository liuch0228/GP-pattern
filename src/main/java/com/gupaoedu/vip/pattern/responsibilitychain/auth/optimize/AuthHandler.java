package com.gupaoedu.vip.pattern.responsibilitychain.auth.optimize;

import com.gupaoedu.vip.pattern.responsibilitychain.auth.Member;

public class AuthHandler extends  Handler {
    @Override
    public void doHandler(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("AuthHandler check ok! 允许操作");
        // 权限检查完了，后面没有handler了；
//        nextHandler.doHandler(member);
    }
}
