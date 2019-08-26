package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.ICourse;

/**
 * 工厂方法模式,一个工厂只能创建一种 产品(返回一种对象)
 *
 * 这里接口还可以改为抽象类,把一些公共的处理放到抽象类里面
 */
public interface ICourseFactory {
    ICourse create(); //这个接口不活,让它的子类干活
}

/*public abstract class IcourseFactory{


    public void preCreate(){
        System.out.println("xxxx");
    }
    abstract ICourse create();
}*/
