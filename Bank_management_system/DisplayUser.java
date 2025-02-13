package Bank_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayUser {
    void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        Connection con = DB_Connection.connect();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM user WHERE name = ? AND password = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                int balance = rs.getInt("balance");
                System.out.println("\n===== User Details =====");
                System.out.println("User ID: " + id);
                System.out.println("Name: " + username);
                System.out.println("Balance: " + balance);
                System.out.println("========================");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
