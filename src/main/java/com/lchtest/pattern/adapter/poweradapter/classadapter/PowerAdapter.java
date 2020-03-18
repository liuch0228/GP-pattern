package com.lchtest.pattern.adapter.poweradapter.classadapter;

public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int outputDC5V() {
        int adapterInput = super.outPutAC220();
        int adapterOutput = adapterInput/ 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput  + "V");
        return adapterOutput ;
    }
}
