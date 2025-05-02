package com.nrev.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class AppLifecycleLogger implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("Application started!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("Application shutting down!");
    }
}
