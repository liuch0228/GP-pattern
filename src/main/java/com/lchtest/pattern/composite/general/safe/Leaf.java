package com.lchtest.pattern.composite.general.safe;

/**
 * 叶子节点
 * 不管是叶子节点，还是根节点，都继承抽象根节点Component
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    //  这里继承的时候只会重写operation
    @Override
    public String operation() {
        return this.name;
    }

}
