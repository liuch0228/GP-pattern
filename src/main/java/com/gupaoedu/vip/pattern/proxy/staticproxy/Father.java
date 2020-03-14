package com.gupaoedu.vip.pattern.proxy.staticproxy;

public class Father {

    private Son son;
    public Father(Son son){
        this.son = son;
    }
    public void findLove(){
        System.out.println("父亲物色对象");
        this.son.findLove(20);
        System.out.println("双方父母同意，确立关系 ");
    }
}
