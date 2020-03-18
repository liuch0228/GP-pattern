package com.lchtest.pattern.prototype.deep;

public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try{
            //调用深克隆方法
            QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println("深克隆:" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));//输出false
        }catch (Exception e){
            e.printStackTrace();
        }
        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = (QiTianDaSheng)q.shallowClone(q);
        System.out.println("浅克隆:" +( n.jinGuBang == q.jinGuBang));

    }
}
