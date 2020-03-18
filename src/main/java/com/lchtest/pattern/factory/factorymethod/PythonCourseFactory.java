package com.lchtest.pattern.factory.factorymethod;

import com.lchtest.pattern.factory.ICourse;
import com.lchtest.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
