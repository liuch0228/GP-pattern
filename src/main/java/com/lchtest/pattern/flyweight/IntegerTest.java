package com.lchtest.pattern.flyweight;

/**
 * jdk中Integer中的享元模式
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(128);
        Integer d = 128;

        System.out.println("a==b:" + (a==b));
        /* Integer有一个内部类IntegerCache将-128~127之间的数缓存到了一个数组中，
          使用时直接取出，此范围之外的，返回一个 new Integer(i)，因此 c和d是不同的对象
        */
        System.out.println("c==d:" + (c==d));
    }
}
