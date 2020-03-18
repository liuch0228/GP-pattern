package com.lchtest.pattern.template.course;

public abstract class NetworkCourse {

    protected final void createCourse() {
        //1.发布预习资料
        this.postPreResource();
        //2.制作PPT课件
        this.creatPPT();

        //3.直播授课
        this.liveVideo();
        //4.提交课件 笔记
        this.postNote();
        //5.提交源码
        this.postSource();

        //6.有作业的话，要检查作业
        if (needHomework()) {
            checkHomework();
        }

    }

    //检查作业会有不同的情况 ，需要定制
    protected abstract void checkHomework();

    //钩子方法，方便子类进行微调
    protected boolean needHomework() {
        return false;
    }

    final void creatPPT() {
        System.out.println("制作备课PPT");
    }

    final void postPreResource() {
        System.out.println("分发预习资料");
    }

    final void liveVideo() {
        System.out.println("直播授课");
    }

    final void postNote() {
        System.out.println("提交课件和笔记");
    }

    final void postSource() {
        System.out.println("提交源码");
    }
}
