package com.gupaoedu.vip.pattern.decorator.gpmenu;

public class MenuDecorator extends  GPMenu {
    private GPMenu gpMenu;
    public MenuDecorator(GPMenu gpMenu){
        this.gpMenu = gpMenu;
    }
    @Override
    public String getMenu() {
        return this.gpMenu.getMenu();
    }
}
