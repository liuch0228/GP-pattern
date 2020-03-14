package com.gupaoedu.vip.pattern.flyweight;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";  // 创建了2个对象 常量池   引用s1
        String s2 = "hello";
//        System.out.println(s1 == s2); // true  都指向常量池“hello”的地址
        String s3 = "he" + "llo";  // 运行时拼接，直接编译成hello, 指向hello的地址
//        System.out.println(s1 == s3);  // true
        String s4 = "hel" + new String("lo");
//        System.out.println(s1 == s4); // false
        String s5 = new String("hello");
//        System.out.println(s1 == s5); // false
//        System.out.println(s4 == s5); // false
        String s6 = s5.intern(); // s5的常量池地址

        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;  // 常量，会做优化，变量，不做优化, s7 + s8 不做优化 s1 ！=s9
        //  "h" + "ello" 常量之间做操作，会被优化，这样和s1比较，是相等的
        System.out.println(s1 == s9);

        Integer a = Integer.valueOf(127);
        // -128~127之间，值会从缓存取，否则就new 一个   -127~128是经验值
        Integer b = 127;
        System.out.println(a == b);  //true
        Integer c = Integer.valueOf(128);
        Integer d = 128;
        System.out.println(c == d); //false

        /*
        * public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
    *
    *
    *
            // range [-128, 127] must be interned (JLS7 5.1.7)
            assert IntegerCache.high >= 127;
        * */
        // 享元模式是一种池化技术， 将常用的缓存起来，使用时直接取，不new
    }
}
