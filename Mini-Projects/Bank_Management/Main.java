package Bank_Management;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banking banking = new Banking();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add new user");
            System.out.println("2. Display user information");
            System.out.println("3. Deposit amount to user account");
            System.out.println("4. Withdraw amount from user account");
            System.out.println("5. View account balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    banking.addUser();
                    break;
                case 2:
                    banking.viewUser();
                    break;
                case 3:
                    banking.deposit();
                    break;
                case 4:
                    banking.withdraw();
                    break;
                case 5:
                    banking.checkBalance();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}