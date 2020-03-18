package com.lchtest.pattern.prototype.deep;

import java.io.Serializable;

/**
 * 金箍棒,可以变大,可以缩小
 */
public class JinGuBang implements Serializable {

    public float h = 100;
    public float d = 10;
    public void big(){
        this.d *=2;
        this.h *=2;
    }
    public void small(){
        this.d/=2;
        this.h /=2;
    }
}
