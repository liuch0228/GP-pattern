package com.gupaoedu.vip.pattern.factory.abstractfactory;

        import com.gupaoedu.vip.pattern.factory.ICourse;
        import com.gupaoedu.vip.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
