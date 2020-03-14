package com.gupaoedu.vip.pattern.singleton.seriable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableSingletonTest {
    public static void main(String[] args) {
        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SerializableSingleton1.obj")
            ;
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //序列化，写入磁盘
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("SerializableSingleton1.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //反序列化，从磁盘读取并转换为Java对象
            s1 = (SerializableSingleton)ois.readObject();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
            /**
             * 运行结果：
             * com.gupaoedu.vip.pattern.singleton.seriable.SerializableSingleton@5f184fc6
             * com.gupaoedu.vip.pattern.singleton.seriable.SerializableSingleton@6e0be858
             * false
             */
            /**
             * 解决办法：
             * private Object readResolve(){
             *         return INSTANCE;
             *     }
             */

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
