package com.nrev.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/nrevservletsdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "p2e3r5l";

    static{
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e){
            throw new RuntimeException("PostgreSQL JDBC Driver not found!" + e);
        }
    }

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
