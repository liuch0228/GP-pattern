package com.lchtest.pattern.composit.demo.transparent;

public abstract class CourseComponent {

    public void addChild(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }


}
