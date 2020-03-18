package com.lchtest.pattern.composite.general.transparent;

public class Test {
    public static void main(String[] args) {
        // 创建一个根节点
        Component root = new Composite("root");
        //  创建两个树枝节点
        Component branchA = new Composite("--BranchA");
        Component branchB = new Composite("----BranchB");
        // 创建三个叶子节点
        Component leafA = new Leaf("----leafA");
        Component leafB = new Leaf("------leafB");
        Component leafC = new Leaf("--leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);
        String result = root.operation();
        System.out.println(result);


    }
}
