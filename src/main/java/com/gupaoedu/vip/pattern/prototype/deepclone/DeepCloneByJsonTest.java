package com.gupaoedu.vip.pattern.prototype.deepclone;

import java.util.ArrayList;

public class DeepCloneByJsonTest {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("jack");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("reading");
        prototype.setHobbies(hobbies);
        System.out.println("原对象：" + prototype);

        ConcretePrototype copy = prototype.deepCloneByJSON();
        // 克隆完成后，给克隆对象添加特有的属性
        copy.getHobbies().add("swimming");
        System.out.println("克隆对象：" + copy);
        System.out.println("修改克隆对象后，原对象：" + prototype);
        System.out.println("prototype == copy? " + (prototype == copy));
        System.out.println("prototype.hobbies == copy.hobbies ? " + (prototype.getHobbies() == copy.getHobbies()));
    }
}
