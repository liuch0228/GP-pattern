package com.lchtest.pattern.template.course;

public class JavaCourse extends NetworkCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查Java的架构课件");
    }
}
