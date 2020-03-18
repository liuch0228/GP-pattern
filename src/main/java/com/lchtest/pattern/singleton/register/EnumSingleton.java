package com.lchtest.pattern.singleton.register;

/**
 * 注册式单例方式1：枚举式单例
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
