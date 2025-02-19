package Reminder_Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    private static final String URL = "jdbc:mysql://localhost:3306/reminderdb";
    private static final String USER = "root";
    private static final String PASSWORD = "MYSQL2114";

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connection to the database established successfully.");
            return conn;
        } catch (SQLException e) {
            System.err.println("❌ Error: Could not connect to the database.");
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("✅ Database connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error: Could not close the database connection.");
            e.printStackTrace();
        }
    }
}
