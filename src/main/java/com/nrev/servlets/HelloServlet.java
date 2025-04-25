package com.nrev.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException{
        System.out.println("HelloServlet initialized");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.getWriter().println("<h1>Hello Servlets!</h1>");
        System.out.println("doGet method called");
    }

    @Override
    public void destroy(){
        System.out.println("HelloServlet Destroyed");
    }
}
