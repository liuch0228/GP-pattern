package com.lchtest.pattern.decorator.passort.upgrade;

import com.lchtest.pattern.decorator.passort.old.ISiginService;
import com.lchtest.pattern.decorator.passort.old.ResultMsg;

public interface ISiginForThirdService extends ISiginService {

    /**
     * QQ登陆
     * @param qq
     * @return
     */
    ResultMsg loginForQQ(String qq);

    /**
     *  微信登陆
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * token登陆
     * @param token
     * @return
     */
    ResultMsg logingForToken(String token);

    /**
     * 手机登录
     * @param telephone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telephone,String code);

    /**
     * 注册后自动登陆
     * @param username
     * @param password
     * @return
     */
    ResultMsg loginForRegist(String username,String password);

  }
