package com.lchtest.pattern.prototype.simple;

import java.util.List;

/**
 * 2.具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象
 */
public class ConcretePrototypeB implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeB concretePrototype = new ConcretePrototypeB();
        concretePrototype.setAge(this.age);
        concretePrototype.setHobbies(this.hobbies);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
