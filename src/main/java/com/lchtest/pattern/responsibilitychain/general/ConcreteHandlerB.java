package com.lchtest.pattern.responsibilitychain.general;

public class ConcreteHandlerB extends Handler {
    @Override
    void handleRequest(String request) {
        if("requestB".equals(request)){
            System.out.println( this.getClass().getSimpleName() + " process request: " + request);
            return ;
        }

        // 调用下一个handler
        if(this.nextHandler !=null){
            this.nextHandler.handleRequest(request);
        }
    }
}
