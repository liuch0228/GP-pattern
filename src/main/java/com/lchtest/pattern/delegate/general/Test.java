package com.lchtest.pattern.delegate.general;

public class Test {
    public static void main(String[] args) {
        Task delegate  = new Delegate();
        delegate.doTask();
    }
}
