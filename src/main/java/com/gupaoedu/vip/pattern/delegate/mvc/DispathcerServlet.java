package com.gupaoedu.vip.pattern.delegate.mvc;

import com.gupaoedu.vip.pattern.delegate.mvc.controllers.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * 使用HttpServlet需要依赖servlet-api.jar
 *
 * 这里委派模式体现在,一个url对应一个controller,dispatcher根据url去调度不同的controller
 *
 */
public class DispathcerServlet extends HttpServlet {

    //保存映射关系
    private List<Handler> handlerMapping = new ArrayList<>();

    //重写servlet的init方法


    @Override
    public void init() throws ServletException {
        //初始化

        try {
            Class memberControllerClass =  MemberController.class;
            //把url跟controller ,method的映射关系放到一个handlerMapping里面,用户获得url之后可以直接取值
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //完成调度
        doDispatch(req, resp);
    }

    /*private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取用户请求地址
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");
        if (uri.equals("getMemberById")) {
            new MemberController().getMemberById(mid);
        } else if (uri.equals("getOrderById")) {
            new OrderController().getOrderById(mid);
        } else if (uri.equals("logut")) {
            new SystemController().logout(mid);
        } else {
             resp.getWriter().write("404 Not Found");
        }
    }*/

    private void doDispatch(HttpServletRequest req,HttpServletResponse resp){
        String uri = req.getRequestURI();
        Handler handler = null;
        for (Handler h:handlerMapping){
            if(uri.equals(h.getUrl())){
                handler = h;
                break;
            }
        }

        try {
            Object obj = handler.getMethod().invoke(handler.getController(), req.getParameter("mid"));
            resp.getWriter().write(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    class Handler{
        private Object controller;
        private Method method;
        private  String url ;
        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;//把普通set方法改造成可以链式调用的set方法
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return  this;
        }
    }



}
