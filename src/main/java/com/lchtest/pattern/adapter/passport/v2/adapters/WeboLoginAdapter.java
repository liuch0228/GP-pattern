package com.lchtest.pattern.adapter.passport.v2.adapters;

import com.lchtest.pattern.adapter.passport.v2.ResultMsg;

public class WeboLoginAdapter extends CommonAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof WeboLoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }

    /*private ResultMsg loginForRegist(String username,String passwd){
        if(null  == passwd){ // 第三方登录没有密码,给个默认值
            passwd = "THIRD_EMPTY";
        }
        super.regist(username,passwd);
        return super.login(username,passwd);
    }*/
}
