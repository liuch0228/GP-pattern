package com.lchtest.pattern.prototype.shallowclone;

        import lombok.Data;
        import lombok.ToString;

        import java.util.List;

/**
 * 浅克隆： 实现Cloneable接口，重写clone方法
 */
@Data
@ToString
public class ConcretePrototype implements Cloneable {
    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

