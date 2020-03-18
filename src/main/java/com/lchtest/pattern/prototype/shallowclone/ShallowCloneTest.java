package com.lchtest.pattern.prototype.shallowclone;

import java.util.ArrayList;

public class ShallowCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("jack");

        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("reading");
        prototype.setHobbies(hobbies);
        System.out.println("源原对象：" + prototype);

        ConcretePrototype copy = (ConcretePrototype) prototype.clone();
        // 克隆完成后，给克隆对象添加特有的属性
        copy.getHobbies().add("swimming");
        System.out.println("克隆对象：" + copy);
        System.out.println("修改克隆对象后，源对象：" + prototype);
        System.out.println("prototype == copy? " + (prototype == copy));
        System.out.println("prototype.hobbies == copy.hobbies ? " + (prototype.getHobbies() == copy.getHobbies()));
    }
}
