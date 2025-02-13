package Bank_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoanHandeler {
    public void checkLoanEligibility() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your User ID: ");
            int UID = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try (Connection con = DB_Connection.connect();
                 PreparedStatement balanceStmt = con.prepareStatement("SELECT name, balance FROM user WHERE id = ?")) {

                balanceStmt.setInt(1, UID);
                ResultSet rs = balanceStmt.executeQuery();

                if (rs.next()) {
                    String name = rs.getString("name");
                    int balance = rs.getInt("balance");
                    int maxLoan = 0;

                    if (balance >= 50000) {
                        maxLoan = 500000;
                    } else if (balance >= 20000) {
                        maxLoan = 200000;
                    } else if (balance >= 10000) {
                        maxLoan = 100000;
                    }

                    if (maxLoan > 0) {
                        System.out.println("\n🎉 Congratulations " + name + "! You are eligible for a loan up to ₹" + maxLoan);
                        System.out.print("Do you want to apply for a loan? (yes/no): ");
                        String choice = scanner.nextLine();

                        if (choice.equalsIgnoreCase("yes")) {
                            System.out.print("Enter loan amount (max ₹" + maxLoan + "): ");
                            int amount = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            if (amount > maxLoan) {
                                System.out.println("❌ You cannot apply for more than ₹" + maxLoan);
                            } else {
                                applyForLoan(UID, name, amount);
                            }
                        } else {
                            System.out.println("✅ Loan application cancelled.");
                        }
                    } else {
                        System.out.println("❌ Sorry, you are not eligible for a loan. Maintain a higher balance to get a loan offer.");
                    }
                } else {
                    System.out.println("❌ User not found!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void applyForLoan(int UID, String name, int amount) {
        try (Connection con = DB_Connection.connect();
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO loan (UID, name, amount, loan_status) VALUES (?, ?, ?, ?)")) {

            pstmt.setInt(1, UID);
            pstmt.setString(2, name);
            pstmt.setInt(3, amount);
            pstmt.setString(4, "Pending");

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ Loan application submitted successfully for ₹" + amount + "! Status: Pending.");
            } else {
                System.out.println("❌ Loan application failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
