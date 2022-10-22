package jm.task.core.jdbc.util;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final String USERNAME = "root1";
    private final String PASSWORD = "root1";

    public Connection getConnection() {
        Connection connection;

        try {
            /*Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);*/
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Connection OK");
            } else {
                System.out.println("Connection Error!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
