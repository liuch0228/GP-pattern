package com.lchtest.pattern.adapter.loginadapter.v2.adapters;

import com.lchtest.pattern.adapter.loginadapter.ResultMsg;

/**
 * 在适配器里面，这个接口是可有可无，不要跟模板模式混淆
 * 模板模式一定是抽象类，而这里仅仅只是一个接口
 * Created by Tom on 2019/3/16.
 */
public interface LoginAdapter {
    //判断 是不是兼容
    boolean support(Object adapter);
    //能兼容,才调用login方法
    ResultMsg login(String id, Object adapter);

}
