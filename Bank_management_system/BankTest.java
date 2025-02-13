package Bank_management_system;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            InsertUser insertUser = new InsertUser();
            DisplayUser displayUser = new DisplayUser();
            DepositAmount depositAmount = new DepositAmount();
            WithdrawAmount withdrawAmount = new WithdrawAmount();
            LoanHandeler loanHandler = new LoanHandeler();
            DisplayLoan displayLoan = new DisplayLoan();

            while (true) {
                System.out.println("\n===== Bank Management System =====");
                System.out.println("1. Add User");
                System.out.println("2. Display User Details");
                System.out.println("3. Deposit Amount");
                System.out.println("4. Withdraw Amount");
                System.out.println("5. Check Loan Eligibility & Apply");
                System.out.println("6. View Loan Details");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        insertUser.add();
                        break;
                    case 2:
                        displayUser.display();
                        break;
                    case 3:
                        depositAmount.depositAmount();
                        break;
                    case 4:
                        withdrawAmount.withdrawAmount();
                        break;
                    case 5:
                        loanHandler.checkLoanEligibility();
                        break;
                    case 6:
                        displayLoan.displayLoan();
                        break;
                    case 7:
                        System.out.println("Exiting... Thank you!");
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1-7.");
                }
            }
        }
    }
}
