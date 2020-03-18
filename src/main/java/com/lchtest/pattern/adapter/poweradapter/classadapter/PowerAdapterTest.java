package com.lchtest.pattern.adapter.poweradapter.classadapter;

public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
        // 这里有个问题，如果改成PowerAdapter dc5 = new PowerAdapter(),那么 dc5也可以调用父类的outPutAC220() 方法，违背了最少知道原则

    }
}
