package com.lchtest.pattern.softwaredesign.rule.openclosedprinciple;

/**
 * 整个课程生态有Java架构、大数据、人工智能、前端、软件测试等，创建一个Java架构课程的类JavaCourse
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public JavaCourse() {
    }
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
