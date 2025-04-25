package com.nrev.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class LoggingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException{
        System.out.println("LoggingFilter Initialized");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        System.out.println("Incoming request: " + req.getRemoteAddr());
        chain.doFilter(req,res);
    }

    @Override
    public void destroy(){
        System.out.println("LoggingFilter Destroyed");
    }
}
