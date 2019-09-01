package com.gupaoedu.vip.pattern.delegate.simple;

public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A,我擅长加密,开始执行" +command);
    }
}
