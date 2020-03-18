package com.lchtest.pattern.prototype.simple;

import java.util.ArrayList;

public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setName("tom");
        concretePrototype.setAge(19);
        ArrayList list = new ArrayList();
        list.add("reading");
        concretePrototype.setHobbies(list);
        ConcretePrototypeA copy =(ConcretePrototypeA) new Client().startClone(concretePrototype);
        System.out.println(copy);
        System.out.println("copy==concretePrototype? " + (concretePrototype == copy));
        System.out.println("克隆对象中引用类型地址的值:"+ copy.getHobbies());
        System.out.println("原对象中引用类型地址的值:"+ concretePrototype.getHobbies());
        //对于引用类型,这种原型写法只是把引用的值传递出去,而不是把里面的内容传递出去,是浅克隆
        System.out.println("对象地址比较:"+ (concretePrototype.getHobbies() == copy.getHobbies())); //对象地址比较:true

    }
}
