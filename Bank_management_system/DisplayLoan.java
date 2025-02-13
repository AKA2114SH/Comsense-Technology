package Bank_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayLoan {
    public void displayLoan() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter User ID: ");
            int UID = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try (Connection con = DB_Connection.connect();
                 PreparedStatement pstmt = con.prepareStatement("SELECT * FROM loan WHERE UID = ?")) {

                pstmt.setInt(1, UID);
                ResultSet rs = pstmt.executeQuery();

                boolean found = false;
                while (rs.next()) {
                    found = true;
                    System.out.println("\n===== Loan Details =====");
                    System.out.println("Loan ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Amount: ₹" + rs.getInt("amount"));
                    System.out.println("Status: " + rs.getString("loan_status"));
                }
                if (!found) {
                    System.out.println("❌ No loan records found for User ID: " + UID);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
