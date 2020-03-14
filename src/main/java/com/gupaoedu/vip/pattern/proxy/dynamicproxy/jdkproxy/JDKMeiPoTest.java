package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;
import java.io.IOException;

public class JDKMeiPoTest {

    public static void main(String[] args) throws IOException {
        //动态代理，媒婆可以给任何人去介绍对象，而不像父亲一样只给儿子物色对象
        Person obj = (Person) new JDKMeiPo().getInstance(new Girl());//动态代理生成的类的名字叫$Proxy0
        obj.findLove(29);

//        Person guimi = (Person) new JDKMeiPo().getInstance(new Friend());
//        guimi.findLove(25);

        //将内存中$Proxy0类的字节码写入到磁盘
//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
//        FileOutputStream fos = new FileOutputStream("E://$Proxy0.class");
//        fos.write(bytes);
//        fos.close();

    }
}
