package com.gupaoedu.vip.pattern.composit.demo.transparent;

public class CourseCompositeTest {
    public static void main(String[] args) {
        System.out.println("==========透明的组合模式=======");
        CourseComponent javabase = new Course("java入门课程",8200);
        CourseComponent aicourse = new Course("AI人工智能课程",10000);
//        CourseComponent python = new Course("python入门课程",8000);
        CourseComponent packageCourse = new CoursePackage("Java架构师课程", 2);

        CourseComponent designPattern = new Course("Java设计模式课程", 1500);
        CourseComponent sourceCode = new Course("源码分析课程", 3600);
        CourseComponent softSkill = new Course("java开发软技能", 3000);

        packageCourse.addChild(designPattern);
        packageCourse.addChild(sourceCode);
        packageCourse.addChild(softSkill);

        // 根节点
        CourseComponent catalog = new CoursePackage("课程目录", 1);
        // 添加根节点的子节点
        catalog.addChild(javabase);
        catalog.addChild(aicourse);
        catalog.addChild(packageCourse);
        catalog.print();

    }
}
