package com.lchtest.pattern.composite.general.safe;

public class Test {
    public static void main(String[] args) {
        // 创建一个根节点Component里面的方法addChild挪到了Composite里面）
        //addChild removeChild是树节点才有的能力，叶子节点不具备
        Composite root = new Composite("root");
        //  创建两个树枝节点
        Composite branchA = new Composite("--BranchA");
        Composite branchB = new Composite("----BranchB");
        // 创建三个叶子节点
        Component leafA = new Leaf("----leafA");
        Component leafB = new Leaf("------leafB");
        Component leafC = new Leaf("--leafC");
         //  addChild不再是Component的方法，而是子类Composite独有的方法
        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);
        String result = root.operation();
        System.out.println(result);


    }
}
