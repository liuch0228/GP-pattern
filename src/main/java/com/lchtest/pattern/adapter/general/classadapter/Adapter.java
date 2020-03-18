package com.lchtest.pattern.adapter.general.classadapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public int request() {
        return super.specificRequest() / 2;// 将220v转换为110v
    }
}
