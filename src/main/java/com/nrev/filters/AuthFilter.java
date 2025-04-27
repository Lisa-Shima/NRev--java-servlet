package com.nrev.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException{
        System.out.println("Auth Filter initialized");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException{
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpSession session = httpRequest.getSession(false);

        if(session == null || session.getAttribute("user") == null){
            System.out.println("Unauthorized access to attempt: " + httpRequest.getRequestURI());
            res.getWriter().write("Unauthorized: Please log in to access this resource");
            return;
        }

        chain.doFilter(req, res);
    }

    @Override
    public void destroy(){
        System.out.println("Auth Filter destroyed.");
    }
}
