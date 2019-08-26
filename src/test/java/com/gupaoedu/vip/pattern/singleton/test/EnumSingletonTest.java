package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试 序列化破坏枚举式单例--
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("EnumSingleton.obj")
;
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton)ois.readObject();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
            /**
             * 输出结果：INSTANCE
             * INSTANCE
             * true 说明枚举式单例，能够保证反序列化不破坏单例
             */
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
