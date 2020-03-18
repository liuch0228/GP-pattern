package com.lchtest.pattern.factory.simplefactory;

import com.lchtest.pattern.factory.ICourse;

/**
 * 简单工厂,一个工厂可以创建不同的产品(对象)
 */
public class CourseFactory {
   /* public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if("python".equals(name)){
            return new PythonCourse();
        } else {
            return null;
        }
    }*/
    //简单工厂的改进，使用反射机制获取对象
    public ICourse create(Class clazz) {
        try {
            if (null != clazz) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
