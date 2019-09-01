package com.gupaoedu.vip.pattern.delegate.simple;

public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("架构", new Leader());
        boss.command("加密 ", new Leader());
    }
}
