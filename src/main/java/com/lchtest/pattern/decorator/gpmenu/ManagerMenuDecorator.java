package com.lchtest.pattern.decorator.gpmenu;

public class ManagerMenuDecorator extends MenuDecorator {
    private GPMenu gpMenu;

    public ManagerMenuDecorator(GPMenu gpMenu) {
        super(gpMenu);

    }

    @Override
    public String getMenu() {
        return super.getMenu() + "、管理帖子";
    }
}
