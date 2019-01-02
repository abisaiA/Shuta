package com.example.marigito.shuta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static String url = "jdbc:mysql://localhost:3306/mydb";
    private static String driverName = "com.mysql.jdbc.driver";
    private static String username = "gitto";
    private static String password = "datacenter";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
