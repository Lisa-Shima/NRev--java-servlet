package com.nrev.filters;

import jakarta.servlet.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class IPBlockFilter implements Filter {
    private List<String> blockedIP;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException{
        blockedIP = Arrays.asList("192.168.1.1", "123.456.7.8");
        System.out.println("IPBlockFilter initialized: " + blockedIP);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException{
        String clientIP = req.getRemoteAddr();
        System.out.println("Request received from: " + clientIP);

        if(blockedIP.contains(clientIP)){
            System.out.println("Blocked IP attempted access: " + clientIP);
            res.getWriter().write("Access Denied! Your IP is blocked.");
            return;
        }

        chain.doFilter(req, res);
    }

    @Override
    public void destroy(){
        System.out.println("IPBlock Filter destroyed.");
    }
}
