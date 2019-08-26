package com.gupaoedu.vip.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 * 优点:对象方便管理,属于懒加载
 * 缺点:getbean线程非安全
 */
public class ContainerSingleton {
//ConcurrentHashMap只保证put的时候是线程安全的,但不能保证get的时候线程安全
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    private static Object lock = new Object();
    private  ContainerSingleton(){}

    /**
     * 这里i获取实例的时候会存在线程安全问题
     * @param className
     * @return
     */
    public static Object getBean(String className){
       synchronized (lock){
           //不存在,先赋值
           if(!ioc.containsKey(className)){
               Object obj = null;
               try{
                   obj = Class.forName(className).newInstance();
                   ioc.put(className,obj);
               } catch (Exception e){
                   e.printStackTrace();
               }
               return  obj;
           }
           //存在,直接返回
           return ioc.get(className);
       }
    }

}
/**
 * "C:\Program Files\Java\jdk1.8.0_181\bin\java.exe" "-javaagent:D:\programsinstall\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=49615:D:\programsinstall\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_181\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\rt.jar;D:\IdeaProjects\target\test-classes;D:\IdeaProjects\target\classes;F:\mavenRepo\junit\junit\4.11\junit-4.11.jar;F:\mavenRepo\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;F:\mavenRepo\org\slf4j\slf4j-log4j12\1.7.2\slf4j-log4j12-1.7.2.jar;F:\mavenRepo\org\slf4j\slf4j-api\1.7.2\slf4j-api-1.7.2.jar;F:\mavenRepo\log4j\log4j\1.2.17\log4j-1.2.17.jar" com.gupaoedu.vip.pattern.singleton.test.ContainerSingletonTest
 * 1566612982103-com.gupaoedu.vip.pattern.singleton.test.Pojo@163093bc
 * 1566612982103-com.gupaoedu.vip.pattern.singleton.test.Pojo@6af4aa13
 * 1566612982104-com.gupaoedu.vip.pattern.singleton.test.Pojo@6af4aa13
 * 1566612982103-com.gupaoedu.vip.pattern.singleton.test.Pojo@6d037c
 * 1566612982103-com.gupaoedu.vip.pattern.singleton.test.Pojo@327da385
 * 1566612982103-com.gupaoedu.vip.pattern.singleton.test.Pojo@72b423f2
 * 1566612982104-com.gupaoedu.vip.pattern.singleton.test.Pojo@6af4aa13
 * 1566612982104-com.gupaoedu.vip.pattern.singleton.test.Pojo@6af4aa13
 * 1566612982104-com.gupaoedu.vip.pattern.singleton.test.Pojo@6af4aa13
 * 1566612982105-com.gupaoedu.vip.pattern.singleton.test.Pojo@6af4aa13
 */
