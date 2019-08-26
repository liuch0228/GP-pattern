package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.JavaCourse;

/**
 * 单一职责,这个工厂只能创建JavaCourse;不同的产品用不同的工厂创建;不同的工厂去负责差异化的创建逻辑
 */
public class JavaCourseFactory implements  ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse(); //这个工厂只能创建JavaCourse,直接new即可
    }
}
