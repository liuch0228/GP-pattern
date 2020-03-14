package com.gupaoedu.vip.pattern.softwaredesign.rule.simpleresponsibility;

/**
 * 从上面代码来看，Course类承担了两种处理逻辑。假如现在要对课程进行加密，
 * 那么直播课和录播课的加密逻辑都不一样，必须要修改代码。
 * 而修改代码逻辑势必会相互影响容易造成不可控的风险。
 * 我们对职责进行分离解耦，来看代码，分别创建两个类ReplayCourse和LiveCourse：
 */
public class SimpleResponsibilityTest {
    public static void main(String[] args) {
        Course course = new Course();
        course.study("直播课 ");
        course.study("录播课 ");
    }
}
