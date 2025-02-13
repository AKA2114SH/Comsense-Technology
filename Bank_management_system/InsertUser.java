package Bank_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
    void add() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter user name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        System.out.println("Enter initial balance:");
        int balance = scanner.nextInt();
        scanner.nextLine(); 
        
        Connection con = DB_Connection.connect();
        
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO user (name, password, balance) VALUES (?, ?, ?)");
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            pstmt.setInt(3, balance);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("User added successfully!");
            } else {
                System.out.println("Failed to add user.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
