package com.lchtest.pattern.adapter.loginadapter.v2.adapters;

import com.lchtest.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public class LoginForQQAdapter implements LoginAdapter {
    //LoginForQQAdapter 这里只兼容QQ登录
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
