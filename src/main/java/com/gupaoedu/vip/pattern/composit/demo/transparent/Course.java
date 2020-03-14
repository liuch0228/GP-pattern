package com.gupaoedu.vip.pattern.composit.demo.transparent;

/**
 * 叶子节点
 */
public class Course extends CourseComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void addChild(CourseComponent courseComponent) {
        super.addChild(courseComponent);
    }

    @Override
    public void removeChild(CourseComponent courseComponent) {
        super.removeChild(courseComponent);
    }

    @Override
    public String getName(CourseComponent courseComponent) {
      return   this.name;
    }

    @Override
    public double getPrice(CourseComponent courseComponent) {
      return   this.price;
    }

    @Override
    public void print() {
        System.out.println( name +"-" + price + "元");
    }
}
