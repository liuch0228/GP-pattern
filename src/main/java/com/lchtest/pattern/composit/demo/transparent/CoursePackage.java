package com.lchtest.pattern.composit.demo.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程包 -树节点
 */
public class CoursePackage extends CourseComponent {

    // 传统方式，不使用组合模式,list里面存的是具体的节点内容
//    private List<Course> items = new ArrayList<>();
    // 使用组合模式，list里面存放CourseComponent，不管是树节点还是叶子节点都能存，无需进行区分
    private List<CourseComponent> items = new ArrayList<>();
    // 课程包的名称
    private String name;
    // 课程包的目录层级
    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent courseComponent) {
        this.items.add(courseComponent);
    }

    @Override
    public void removeChild(CourseComponent courseComponent) {
        items.remove(courseComponent);
    }

    @Override
    public String getName(CourseComponent courseComponent) {
        return this.name;  // 这里也能点出来  this.getName(courseComponent)，实际上会抛异常，是不安全写法
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CourseComponent item : items) {
            if(this.level !=null ){  // 不是根节点，就打印空格进行缩进
               for(int i = 0; i < this.level; i++) {
                   System.out.print("    ");
               }

                for(int i = 0; i < this.level; i++) {
                    if(i == 0){
                        System.out.print("+");  // 根目录打印一个+号，紧跟着打印一个-
                    }
                    System.out.print("-");
                }
            }
            item.print();
        }
    }
}
