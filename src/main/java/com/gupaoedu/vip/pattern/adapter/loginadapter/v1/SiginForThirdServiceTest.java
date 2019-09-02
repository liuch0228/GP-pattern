package com.gupaoedu.vip.pattern.adapter.loginadapter.v1;

import com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service.SinginForThirdService1;
import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;

/**
 * Created by Tom on 2019/3/16.
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService1 service = new SinginForThirdService1();
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");

        AdvisorAdapter advisorAdapter = null;
        HandlerAdapter handlerAdapter = null;
        DispatcherServlet dispatcherServlet = null;
        /*
        * DispatcherServlet里面的doDispatch()方法里面
        * 调用   HandlerAdapter ha = this.getHandlerAdapter(mappedHandler.getHandler());
        * */
    }
}
