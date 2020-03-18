package com.lchtest.pattern.composite.general.transparent;
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

    // 重要：addChild的入参一定是抽象根节点Component，这样就可以实现根节点添加树节点，树节点添加叶子节点，层层嵌套添加！
    /*叶子节点显然不具备addChild的能力，但是这里也进行了空实现，子类可以去实现，
       但是调用的时候又不让调，是一种不安全的写法,违背了最少知道原则*/
    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    public boolean removeChild(Component component){
        throw new UnsupportedOperationException("removeChild not supported!");
    }

    public Component getCild(int index) {
        throw new UnsupportedOperationException("getChild not supported!");
    }
}
