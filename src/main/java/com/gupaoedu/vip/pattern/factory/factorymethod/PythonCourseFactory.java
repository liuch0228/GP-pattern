package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
