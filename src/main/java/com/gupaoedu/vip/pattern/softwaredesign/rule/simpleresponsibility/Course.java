package com.gupaoedu.vip.pattern.softwaredesign.rule.simpleresponsibility;

public class Course {
    public void study(String courseName) {
        if ("直播课".equals(courseName)) {
            System.out.println(courseName + "不能快进");
        } else {
            System.out.println(courseName + "可以反复回看");
        }
    }
}
