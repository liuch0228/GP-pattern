package com.gupaoedu.vip.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 *
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
//齐天大圣不仅是个猴子，还拥有金箍棒
    protected JinGuBang jinGuBang;

    public QiTianDaSheng() { //初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            //完整的新对象ois.readObject 不管怎么样都会new出来一个新对象
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            bis.close();
            ois.close();
            oos.close();
            bos.close();
            copy.birthday = new Date();
            return  copy;
        } catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
//浅克隆方法
    public Object shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;
        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = target.birthday;
        return  qiTianDaSheng;
    }
}
