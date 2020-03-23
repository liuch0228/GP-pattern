package com.lchtest.pattern.adapter.passport.v2.adapters;

import com.lchtest.pattern.adapter.passport.v2.ResultMsg;

public class QQLoginAdapter extends CommonAdapter{
//public class QQLoginAdapter extends PassportService implements ILoginAdapter {
    /**
     * 判断传入的adapter是不是QQLoginAdapter类型，
     * 如果是，才能调用QQLoginAdapter的login方法，如果不是，直接返回了
     * 比如processLogin(openId, QQLoginAdapter.class); 如果传递的是其他的class,则不进行处理
     * @param adapter
     * @return
     */
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof QQLoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        // 这里直接调用父类的loginForRegist
        return super.loginForRegist(id ,null);
    }

    // 下面这段代码每个adapter都会使用到，封装到一个CommonAdapter中,并且CommonAdapter继承PassportService实现ILoginAdapter
    /*protected ResultMsg loginForRegist(String username,String passwd){
        if(null  == passwd){ // 第三方登录没有密码,给个默认值
            passwd = "THIRD_EMPTY";
        }
        regist(username,passwd);
        return login(username,passwd);
    }*/


}
