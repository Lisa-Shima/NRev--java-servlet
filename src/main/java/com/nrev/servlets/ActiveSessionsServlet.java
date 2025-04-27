package com.nrev.servlets;

import com.nrev.listeners.ActiveSessionListener;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/active-sessions")
public class ActiveSessionsServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        res.getWriter().println("<h1>Active sessions: " + ActiveSessionListener.getActiveSessions() + "</h1>");
    }
}
