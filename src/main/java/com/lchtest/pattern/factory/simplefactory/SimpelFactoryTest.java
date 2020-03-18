package com.lchtest.pattern.factory.simplefactory;

import com.lchtest.pattern.factory.ICourse;
import com.lchtest.pattern.factory.JavaCourse;
import com.lchtest.pattern.factory.PythonCourse;

/**
 * 简单工厂模式，
 * 只适用于产品比较少，创建逻辑比较简单的场景
 */
public class SimpelFactoryTest {

    public static void main(String[] args) {
        //创建工厂
        CourseFactory factory = new CourseFactory();
        //从工厂获得对象,不必每次都手动new ICourse,缺点，参数传入错误，则获取不到对象
    /*    ICourse course = factory.create("java");
        course.record();
        course = factory.create("python");
        course.record();*/

        ICourse javaCourse = factory.create(JavaCourse.class);
        javaCourse.record();
        ICourse pythonCourse = factory.create(PythonCourse.class);
        pythonCourse.record();

    }
}





//jdk中的单例模式
      /*  Calendar.getInstance();
                System.out.println(SimpelFactoryTest.class.getName());
        /*
        * log4j工厂模式
        *   public static Logger getLogger(String name) {
                ILoggerFactory iLoggerFactory = getILoggerFactory(); //获取工厂
                return iLoggerFactory.getLogger(name); //获取实例
            }
            //
            public static Logger getLogger(Class clazz) {
                return getLogger(clazz.getName());
            }
        * */
     /*   Logger logger = LoggerFactory.getLogger(SimpelFactoryTest.class.getName());
        BasicConfigurator.configure();
        logger.debug("hello logger"); */