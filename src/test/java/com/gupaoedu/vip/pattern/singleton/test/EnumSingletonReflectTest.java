package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonReflectTest {
    public static void main(String[] args) {
        try {
           Class clazz = EnumSingleton.class;
//            Constructor c = clazz.getDeclaredConstructor();
//            c.setAccessible(true);
//            c.newInstance();

            /**
             * 执行 c.newInstance(); 报错，因为压根就没有一个无参构造了
             * java.lang.NoSuchMethodException: com.gupaoedu.vip.pattern.singleton.register.EnumSingleton.<init>()
             * 	at java.lang.Class.getConstructor0(Class.java:3082)
             * 	at java.lang.Class.getDeclaredConstructor(Class.java:2178)
             * 	at com.gupaoedu.vip.pattern.singleton.test.EnumSingletonReflectTest.main(EnumSingletonReflectTest.java:11)
             */

//获取有参构造，继续通过反射破坏单例
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            EnumSingleton obj = (EnumSingleton)c.newInstance("tom", 999);
            System.out.println(obj);
            /**
             * 这时报错如下：
             * java.lang.IllegalAccessException: Class com.gupaoedu.vip.pattern.singleton.test.EnumSingletonReflectTest can not access a member of class com.gupaoedu.vip.pattern.singleton.register.EnumSingleton with modifiers "private"
             * 	at sun.reflect.Reflection.ensureMemberAccess(Reflection.java:102)
             * 	at java.lang.reflect.AccessibleObject.slowCheckMemberAccess(AccessibleObject.java:296)
             * 	at java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:288)
             * 	at java.lang.reflect.Constructor.newInstance(Constructor.java:413)
             * 	at com.gupaoedu.vip.pattern.singleton.test.EnumSingletonReflectTest.main(EnumSingletonReflectTest.java:25)
             */
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
