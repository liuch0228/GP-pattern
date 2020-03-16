package com.gupaoedu.vip.pattern.birdge.general;

public class Abstraction {
    private IImplementor implementor;
    public Abstraction(IImplementor implementor){
        this.implementor = implementor;
    }

    public void operation() {
        this.implementor.operationImpl();
    }

}
