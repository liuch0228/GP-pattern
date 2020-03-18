package com.lchtest.pattern.composite.general.transparent;

/**
 * 叶子节点
 * 不管是叶子节点，还是根节点，都继承抽象根节点Component
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }

    @Override
    public boolean addChild(Component component) {
        return super.addChild(component);
    }

    @Override
    public boolean removeChild(Component component) {
        return super.removeChild(component);
    }

    @Override
    public Component getCild(int index) {
        return super.getCild(index);
    }
}
