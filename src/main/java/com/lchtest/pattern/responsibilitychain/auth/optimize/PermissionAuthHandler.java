package com.lchtest.pattern.responsibilitychain.auth.optimize;

import com.lchtest.pattern.responsibilitychain.auth.Member;

public class PermissionAuthHandler extends  Handler {
    @Override
    public void validate(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("PermissionAuthHandler  check ok! 允许操作");
        // 权限检查完了，后面没有handler了；
//        nextHandler.validate(member);
    }
}
