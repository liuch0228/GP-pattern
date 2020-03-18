package com.lchtest.pattern.decorator.gpmenu;

public class VIPMenuDecorator extends MenuDecorator {
    private GPMenu gpMenu;

    public VIPMenuDecorator(GPMenu gpMenu) {
        super(gpMenu);
    }

    @Override
    public String getMenu() {
        return super.getMenu() + "、提问、作业、关注、收藏";
    }

}
