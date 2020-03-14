package com.gupaoedu.vip.pattern.composite.general.safe;

import java.util.ArrayList;
import java.util.List;

// 树节点
public class Composite extends Component {

    //树枝节点只需维护一个抽象根节点的集合 （List<Component>）即可存储系统所有层次内容
    private List<Component> components;

    public Composite(String name) {
        super(name);
        this.components = new ArrayList<Component>();
    }

    // 节点的具体行为
    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component : components) {
            builder.append("\n").append(component.operation());
        }
        return builder.toString();
    }

    public boolean addChild(Component component) {
        return this.components.add(component);
    }
    // 移除操作是将components中的元素移除
    public boolean removeChild(Component component) {
        return this.components.remove(component);
    }
    public Component getCild(int index) {
        return this.components.get(index);
    }
}
