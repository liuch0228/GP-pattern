package com.lchtest.pattern.adapter.poweradapter.interfaceadapter;

public class PowerAdapterTest {
    public static void main(String[] args) {

        DC dc5 = new PowerAdapter(new AC220());
       dc5.output5V();

    }
}
