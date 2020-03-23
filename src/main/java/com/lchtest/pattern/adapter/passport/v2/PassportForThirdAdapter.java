package com.lchtest.pattern.adapter.passport.v2;

import com.lchtest.pattern.adapter.passport.v2.adapters.*;

/**
 * 适配器Adapter —— 继承源来老的登录逻辑，实现新的登录接口,这样具备了老的登录功能和新的登录功能
 */
public class PassportForThirdAdapter implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, QQLoginAdapter.class);
    }

    @Override
    public ResultMsg loginWechat(String openId) {
        return processLogin(openId, WechatLoginAdapter.class);
    }

    @Override
    public ResultMsg loginForWeibo(String openId) {
        return processLogin(openId, WeboLoginAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, TokenLoginAdapter.class);
    }

    @Override
    public ResultMsg loginForTelePhone(String phone,String code) {
//        return loginForRegist(phone,code);
        // 这里processLogin方法第一个入参应该是一个可变数组，而不是固定的String类型，待修改
        return processLogin(phone, TelePhoneLoginAdapter.class);
    }

    /**
     * 假设这里都是首次登录，登录之前需要完成自动注册功能，内部实现
     * @param username
     * @param passwd
     * @return
     */


    /**
     *
     * @param id
     * @param clazz 具体的适配器类,通过泛型约束入参适配器类只能是ILoginAdapter的子类
     * @return
     */
    private ResultMsg processLogin(String id,Class<? extends ILoginAdapter> clazz){
       try {
           ILoginAdapter  adapter = clazz.newInstance();
           if(adapter.support(adapter)){
               return adapter.login(id,adapter);
           }
       } catch (Exception e){
           e.printStackTrace();
       }
       return null;
    }

   /* private ResultMsg loginForRegist(String username,String passwd){
        if(null  == passwd){ // 第三方登录没有密码,给个默认值
            passwd = "THIRD_EMPTY";
        }
        super.regist(username,passwd);
        return super.login(username,passwd);
    }*/
}
