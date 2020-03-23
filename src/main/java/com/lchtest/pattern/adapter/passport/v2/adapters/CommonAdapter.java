package com.lchtest.pattern.adapter.passport.v2.adapters;

import com.lchtest.pattern.adapter.passport.v2.ILoginAdapter;
import com.lchtest.pattern.adapter.passport.v2.PassportService;
import com.lchtest.pattern.adapter.passport.v2.ResultMsg;

/**
 * 将各个adapter中的共性抽取出来，包括loginForRegist方法，以及extends PassportService implements ILoginAdapter
 * 然后各个adapter只需要继承CommonAdapter即可
 */
public abstract class CommonAdapter extends PassportService implements ILoginAdapter {

    protected ResultMsg loginForRegist(String username, String passwd){
        if(null  == passwd){ // 第三方登录没有密码,给个默认值
            passwd = "THIRD_EMPTY";
        }
        regist(username,passwd);
        return login(username,passwd);
    }

}
