package com.lchtest.pattern.singleton.test;

import com.lchtest.pattern.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getBean("com.gupaoedu.vip.pattern.singleton.test.Pojo");
                    System.out.println(System.currentTimeMillis() + "-" + obj);
                }
            },10,6);//10个线程,6次并发

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
