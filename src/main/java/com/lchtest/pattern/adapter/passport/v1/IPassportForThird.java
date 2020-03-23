package com.lchtest.pattern.adapter.passport.v1;

/**
 * 适配器的Target角色，需要新增的第三方登录登陆方式
 *
 */
public interface IPassportForThird {
    /**
     * QQ登录
     * @param openId
     * @return
     */
    ResultMsg loginForQQ(String openId);

    /**
     * 微信登录
     * @param openId
     * @return
     */
    ResultMsg loginWechat(String openId);

    /**
     * 新浪微博登录
     * @param openId
     * @return
     */
    ResultMsg loginForWeibo(String openId);

    /**
     *  内部系统间登录 ：token登陆
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机登录，需要验证码
     * @param phone
     * @param code
     * @return
     */
    ResultMsg loginForTelePhone(String phone,String code);

}
