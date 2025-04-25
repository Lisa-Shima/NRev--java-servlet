package com.nrev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class FormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        Retrieving data from the form
        String name = req.getParameter("name");
        String email = req.getParameter("email");
//        Session management
        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        session.setAttribute("email", email);

//        res.setContentType("text/html");
//        res.getWriter().println("<h1>Form successfully submitted</h1>");
//        res.getWriter().println("<p>Name: " + name + "</p>");
//        res.getWriter().println("<p>Email: " + email + "</p>");

//        Redirect to another page
        res.sendRedirect("greet");
    }
}
