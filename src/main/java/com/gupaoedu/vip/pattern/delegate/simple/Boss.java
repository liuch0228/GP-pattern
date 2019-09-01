package com.gupaoedu.vip.pattern.delegate.simple;

public class Boss {
    //boss给leader下命令
    public void command(String command,Leader leader){
        //leader接受一个命令去干活
        leader.doing(command);
    }
}
