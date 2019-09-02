package com.gupaoedu.vip.pattern.adapter.poweradapter;

public class PowerAdapter implements DC5 {
//要兼容220v,需要将220v作为输入(静态代理)
private  AC220 ac220;
    public PowerAdapter(AC220 ac220) {
        this.ac220  =ac220;
    }

    @Override
    public int OutputDC5V() {
        int adapterInput = ac220.outPutAC220();
        int adapterOutput = adapterInput/44;  //适配逻辑
        System.out.println("使用PowerAdapter输入ac:" + adapterInput + "V,输出:"+ adapterOutput + "V");
        return adapterOutput;
    }
}
