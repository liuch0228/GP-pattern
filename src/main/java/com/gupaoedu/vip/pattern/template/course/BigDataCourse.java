package com.gupaoedu.vip.pattern.template.course;

public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查大数据课后作业");
    }

    //重写父类的这个方法
    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
