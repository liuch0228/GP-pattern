package com.lchtest.pattern.adapter.passport.v1;

/**
 * 老的登录逻辑
 */
public class PassportService {
    /**
     * 注册方法
     * @param username
     * @param passwd
     * @return
     */
    public ResultMsg regist(String username,String passwd){
        return  new ResultMsg(200,"注册成功",new Member());
}

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return  new ResultMsg(200,"登陆成功",new Member());
    }
}