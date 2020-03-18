package com.lchtest.pattern.birdge.general;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("refined operation");
    }
}
