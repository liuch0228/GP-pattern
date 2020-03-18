package com.lchtest.pattern.builder;

/**
 * 建造者
 */
public class ComputerBuilder  implements IComputerBuilder{

    // 要构建的对象
    private Computer computer = new Computer();

    // build方法返回构建好的完整的对象
    @Override
    public Computer build(String cpu,String ram) {
        computer.setCpu(cpu);
        computer.setRam(ram);
        return computer;
    }

    public ComputerBuilder setDisplay(String display) {
        computer.setDisplay(display);
        return this;
    }

    public ComputerBuilder setKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
        return this;
    }

    public ComputerBuilder setUsbCount(int usbCount) {
        computer.setUsbCount(usbCount);
        return this;
    }


}
