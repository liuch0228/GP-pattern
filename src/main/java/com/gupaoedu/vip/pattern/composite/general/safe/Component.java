package com.gupaoedu.vip.pattern.composite.general.safe;
/**
 * 抽象根节点；抽取了系统各个层次的共性行为，把根节点和子节点的相同的行为取出来
 */
public abstract class Component {

    protected String name;
    public Component(String name){
        this.name = name;
    }
    // 各个叶子节点自己的特性，定义为抽象方法，由叶子节点自行实现
    public abstract String operation();

//    public boolean addChild(Component component) {
//        throw new UnsupportedOperationException("addChild not supported!");
//    }
//
//    public boolean removeChild(Component component){
//        throw new UnsupportedOperationException("removeChild not supported!");
//    }
//
//    public Component getCild(int index) {
//        throw new UnsupportedOperationException("getChild not supported!");
//    }
}
