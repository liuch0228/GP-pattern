package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;

import com.gupaoedu.vip.pattern.proxy.Person;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy.Girl;

import java.io.IOException;

public class GPProxyTest {

    public static void main(String[] args) throws IOException {
        //动态代理，媒婆可以给任何人去介绍对象，而不像父亲一样只给儿子物色对象
        Person obj = ( Person) new GPMeiPo().getInstance(new Girl());//动态代理生成的类的名字叫$Proxy0
        obj.findLove();

    }
}
