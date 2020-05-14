package com.lagou.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String uri = request.getRequestURI();
        if(uri.indexOf("index") >= 0 || uri.indexOf("list") >= 0) {
            return true;
        }

        if(request.getSession().getAttribute("token") != null) {
            return true;
        }
        request.setAttribute("msg", "请先登录才能访问");
        request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request,response);
        return false;
    }
}
