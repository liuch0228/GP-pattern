package com.lchtest.pattern.softwaredesign.rule.openclosedprinciple;

/**
 * 设计原则1：开闭原则  对扩展开放，对修改关闭
 * 本例通过继承，实现不修改原JavaCourse类的情况下新增新的功能
 */
public class CourseTest {
    public static void main(String[] args) {
        JavaDiscountCourse discountCourse = new JavaDiscountCourse(1, "tom", 2000D);
        System.out.println("课程原价" + discountCourse.getOriginPrice());
        //
        System.out.println("课程优惠价" + discountCourse.getPrice(0.6));
    }
}
