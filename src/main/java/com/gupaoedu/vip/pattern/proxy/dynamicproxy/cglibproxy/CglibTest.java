package com.gupaoedu.vip.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibTest {

    public static void main(String[] args) {
        try {

            //cglib原理分析:1.输出到磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"F://cglib_proxy_classes");
            Customer customer = (Customer)new CGlibMeipo().getInstance(Customer.class);
            System.out.println(customer);
            /*打印出来是com.gupaoedu.vip.pattern.proxy.dynamicproxy.cglibproxy.Customer$$EnhancerByCGLIB$$edd382df@443b7951
                这里customer.findLove()实际上是调用了Customer的子类Customer$$EnhancerByCGLIB$$edd382df重写的findLove()方法,
                重写的findLove方法里面又调用了intercept();方法
             */
            customer.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
