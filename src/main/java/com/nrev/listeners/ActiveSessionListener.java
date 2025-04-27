package com.nrev.listeners;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class ActiveSessionListener implements HttpSessionListener {
    private static int activeSessions = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se){
        activeSessions++;
        System.out.println("Session created. Total active sessions: " + activeSessions);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se){
        activeSessions--;
        System.out.println("Session destroyed. Total active sessions: " + activeSessions);
    }

    public static int getActiveSessions(){
        return activeSessions;
    }
}
