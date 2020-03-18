package com.lchtest.pattern.factory.abstractfactory;

public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
