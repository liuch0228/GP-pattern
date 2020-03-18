package com.lchtest.pattern.responsibilitychain.general;

public class ConcreteHandlerA extends Handler {
    @Override
    void handleRequest(String request) {
        if("requestA".equals(request)){
            System.out.println( this.getClass().getSimpleName() + " process request: " + request);
            return ;
        }

        // 当前handler处理不了请求，交给下一个handler去处理
        if(this.nextHandler !=null){
            this.nextHandler.handleRequest(request);
        }
    }

}
