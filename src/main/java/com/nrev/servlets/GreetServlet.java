package com.nrev.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class GreetServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session != null){
            String name = (String) session.getAttribute("name");
            res.setContentType("text/html");
            res.getWriter().println("<h1>Welcome, " + name + "</h1>");
        }
        else{
            res.getWriter().println("<p>No session found!</p>");
        }
    }
}
