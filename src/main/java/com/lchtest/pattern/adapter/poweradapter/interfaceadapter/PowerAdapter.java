package com.lchtest.pattern.adapter.poweradapter.interfaceadapter;


public class PowerAdapter implements DC {
    // 将源角色作为适配器的成员变量
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outPutAC220();
        int adapterOutput = adapterInput / 44;  //适配逻辑
        System.out.println("使用Adapter输入AC:" + adapterInput + "V,输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
