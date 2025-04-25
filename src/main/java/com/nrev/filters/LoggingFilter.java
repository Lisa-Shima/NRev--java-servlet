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
        System.out.println("Request received from: " + req.getRemoteAddr());
        System.out.println("Processing...");
        long startTime = System.currentTimeMillis();

        chain.doFilter(req,res);

        long endTime = System.currentTimeMillis();

        System.out.println("Response sent to: " + req.getRemoteAddr());
        System.out.println("Response processed in " + (endTime - startTime) + "ms");
    }

    @Override
    public void destroy(){
        System.out.println("LoggingFilter Destroyed");
    }
}
