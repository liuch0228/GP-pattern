package com.gupaoedu.vip.pattern.prototype.deepclone;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.ToString;

import java.io.*;
import java.util.List;

@Data
@ToString
public class ConcretePrototype implements Serializable {
    private int age;
    private String name;
    private List<String> hobbies;

    //  json方式深克隆不需要实现序列化接口
    public ConcretePrototype deepCloneByJSON() {
        String jsonString = JSON.toJSONString(this);
        ConcretePrototype clone = JSON.parseObject(jsonString, ConcretePrototype.class);
        return clone;
    }

    // 字节流方式深克隆需要实现序列化接口
    public ConcretePrototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            ConcretePrototype clone = (ConcretePrototype) ois.readObject();
            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
