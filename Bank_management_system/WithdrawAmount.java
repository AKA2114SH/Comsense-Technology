package Bank_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class WithdrawAmount {
    public void withdrawAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Connection con = DB_Connection.connect();
        try {
            // Check current balance
            PreparedStatement checkUser = con.prepareStatement("SELECT balance FROM user WHERE id = ?");
            checkUser.setInt(1, id);
            ResultSet rs = checkUser.executeQuery();

            if (rs.next()) {
                int currentBalance = rs.getInt("balance");
                if (currentBalance >= amount) {
                    // Withdraw money
                    PreparedStatement pstmt = con.prepareStatement("UPDATE user SET balance = balance - ? WHERE id = ?");
                    pstmt.setInt(1, amount);
                    pstmt.setInt(2, id);

                    int rowsUpdated = pstmt.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("Amount withdrawn successfully!");
                        System.out.println("Remaining balance: " + (currentBalance - amount));
                    }
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("User not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
