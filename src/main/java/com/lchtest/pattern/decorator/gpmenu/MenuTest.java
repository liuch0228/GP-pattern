package com.lchtest.pattern.decorator.gpmenu;

public class MenuTest  {
    public static void main(String[] args) {
        GPMenu menu ;
        menu = new BaseMenu();
        menu = new VIPMenuDecorator(menu);
        System.out.println("VIP学员能够访问的菜单有：" + menu.getMenu());
        menu = new ManagerMenuDecorator(menu);
        System.out.println("管理员能够访问的菜单有：" + menu.getMenu());
    }
}
