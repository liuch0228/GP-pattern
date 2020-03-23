package com.lchtest.pattern.adapter.passport.v2;

public interface ILoginAdapter {
    /**
     * 判断适配器是否支持这个逻辑
     * @param object
     * @return
     */
    boolean support(Object object);

    /**
     * 实际的登录接口
     * @param id
     * @param adapter 具体的适配器接口
     * @return
     */
    ResultMsg login(String id,Object adapter);
}
