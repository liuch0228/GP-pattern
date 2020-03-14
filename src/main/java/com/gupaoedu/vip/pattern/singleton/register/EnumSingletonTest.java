package com.gupaoedu.vip.pattern.singleton.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("EnumSingleton.obj")        ;
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton)ois.readObject();
            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1 == s2);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
