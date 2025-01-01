package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetails {
    public static final String URL ="jdbc:mysql://localhost:3306/truck_mgmt";
    public static final String us= "root";
    public static final String pass= "911GT3RS";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,us,pass);
    }

}
