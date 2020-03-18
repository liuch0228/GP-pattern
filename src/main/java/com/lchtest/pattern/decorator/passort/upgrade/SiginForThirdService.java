package com.lchtest.pattern.decorator.passort.upgrade;

import com.lchtest.pattern.decorator.passort.old.ISiginService;
import com.lchtest.pattern.decorator.passort.old.ResultMsg;

/**
 * 包装器
 */
public class SiginForThirdService implements ISiginForThirdService {

    //被包装者
    private ISiginService siginService;

    public SiginForThirdService(ISiginService siginService) {
        this.siginService = siginService;
    }

    @Override
    public ResultMsg loginForQQ(String qq) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg logingForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telephone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        //原有的方法直接调用
        return siginService.regist(username, password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return siginService.login(username,password);
    }
}
