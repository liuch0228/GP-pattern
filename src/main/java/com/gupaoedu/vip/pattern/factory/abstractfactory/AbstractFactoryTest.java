package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        //同一个工厂创建多个产品;同一个产品可以被不同的工厂创建
         factory.createCourse().record();
         factory.createNote().edit();
         factory.createVideo().record();

         //python工厂
        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createCourse().record();
        pythonCourseFactory.createNote().edit();
        pythonCourseFactory.createVideo().record();
    }
}
