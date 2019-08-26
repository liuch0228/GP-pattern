package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制python课程");
    }
}
