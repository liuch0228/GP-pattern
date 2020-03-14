package com.gupaoedu.vip.pattern.softwaredesign.rule.simpleresponsibility;

public class SimpleResponsibilityTest2 {
    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");
        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
