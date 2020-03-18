package com.lchtest.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 负责任务调度
 */
public class Leader implements IEmployee {
    //leader预先知道每个员工的特长
    private Map<String, IEmployee> register = new HashMap<>();

    public Leader() {
        register.put("加密", new EmployeeA());
        register.put("架构", new EmployeeB());
    }

    public void doing(String command) {
//leader负责调度,把任务分配给员工,让员工去干活
        register.get(command).doing(command);
    }
}
