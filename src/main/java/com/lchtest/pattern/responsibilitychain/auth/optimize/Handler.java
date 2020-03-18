package com.lchtest.pattern.responsibilitychain.auth.optimize;

import com.lchtest.pattern.responsibilitychain.auth.Member;

public abstract  class Handler {
    protected  Handler nextHandler;
    public void next(Handler handler){
        this.nextHandler = handler;
    }
    // 抽象方法，每个具体的handler处理一种验证
    public abstract void doHandler(Member member);

}
