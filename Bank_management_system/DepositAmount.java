package Bank_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepositAmount {
    public void depositAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Connection con = DB_Connection.connect();
        try {
            // Check if user exists
            PreparedStatement checkUser = con.prepareStatement("SELECT balance FROM user WHERE id = ?");
            checkUser.setInt(1, id);
            ResultSet rs = checkUser.executeQuery();

            if (rs.next()) {
                // Update balance
                PreparedStatement pstmt = con.prepareStatement("UPDATE user SET balance = balance + ? WHERE id = ?");
                pstmt.setInt(1, amount);
                pstmt.setInt(2, id);

                int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Amount deposited successfully!");

                    // Show updated balance
                    int newBalance = rs.getInt("balance") + amount;
                    System.out.println("Current balance: " + newBalance);
                }
            } else {
                System.out.println("User not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
