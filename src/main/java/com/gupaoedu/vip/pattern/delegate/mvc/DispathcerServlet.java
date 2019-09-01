package com.gupaoedu.vip.pattern.delegate.mvc;

import com.gupaoedu.vip.pattern.delegate.mvc.controllers.MemberController;
import com.gupaoedu.vip.pattern.delegate.mvc.controllers.OrderController;
import com.gupaoedu.vip.pattern.delegate.mvc.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 使用HttpServlet需要依赖servlet-api.jar
 */
public class DispathcerServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //完成调度
        doDispatch(req, resp);


    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
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
    }
}
