package com.lchtest.pattern.proxy.staticproxy;

public class FatherProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());//父亲只帮自己的儿子物色对象
        //静态代理
        father.findLove();
    }
}
