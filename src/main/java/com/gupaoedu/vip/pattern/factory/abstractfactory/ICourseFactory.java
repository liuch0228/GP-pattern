package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.ICourse;

/**
 * 要求所有的子工厂都实现 这个工厂
 * 一个品牌的抽象
 */
public interface ICourseFactory {
    ICourse createCourse();
    //不仅能创建课程,还能创建笔记和视频
    INote createNote();

    IVideo createVideo();
}
