package com.lchtest.pattern.adapter.poweradapter.objectadapter;

/**
 * 5V的标准接口,适配器需要实现该接口,完成适配逻辑
 */
public interface DC5 {
    int outputDC5V();
}
