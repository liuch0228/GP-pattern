package com.lchtest.pattern.builder;

public class Director {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        //1.每次都是由builder去操作这个对象，对使用者来讲，对象的创建过程被封装了起来
        //2.对于可选参数，用户可以设置，也可以不设置，先设置哪个，后设置哪个，都不影响对象的构建，使用者可以自由定制
        // 缺点：产生多余的builder对象；如果产品内部发生变化，建造者都要修改
        computerBuilder.setDisplay("27寸显示器")
                .setKeyboard("罗技键盘")
                .setUsbCount(3);
        Computer computer = computerBuilder.build("英特尔cpu", "三星ram");
        System.out.println(computer);

        StringBuilder stringBuilder = new StringBuilder();

    }
}
