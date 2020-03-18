package com.lchtest.pattern.decorator.passort.old;


public interface ISiginService {
//注册功能
    ResultMsg regist(String username,String password);
    //登陆功能
    ResultMsg login(String username,String password);
}
