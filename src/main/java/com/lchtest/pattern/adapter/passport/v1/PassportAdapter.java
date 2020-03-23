package com.lchtest.pattern.adapter.passport.v1;

/**
 * 适配器Adapter —— 继承源来老的登录逻辑，实现新的登录接口,这样具备了老的登录功能和新的登录功能
 */
public class PassportAdapter extends PassportService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginWechat(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForWeibo(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token,null);
    }

    @Override
    public ResultMsg loginForTelePhone(String phone,String code) {
        return loginForRegist(phone,code);
    }

    /**
     * 假设这里都是首次登录，登录之前需要完成自动注册功能，内部实现
     * @param username
     * @param passwd
     * @return
     */
    private ResultMsg loginForRegist(String username,String passwd){
        if(null  == passwd){ // 第三方登录没有密码,给个默认值
            passwd = "THIRD_EMPTY";
        }
        super.regist(username,passwd);
        return super.login(username,passwd);
    }
}
