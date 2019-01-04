//package com.example.marigito.shuta;
//
//import com.mysql.cj.jdbc.MysqlDataSource;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class DatabaseConfig {
//    private String username = "gitto";
//    private String password = "datacenter";
//
//    public Connection getConnection() throws SQLException {
//        MysqlDataSource mysqlDataSource = new MysqlDataSource();
//        mysqlDataSource.setUser(username);
//        mysqlDataSource.setPassword(password);
//        mysqlDataSource.setServerName("localhost");
//        mysqlDataSource.setDatabaseName("mydb");
//        return mysqlDataSource.getConnection();
//    }
//}
