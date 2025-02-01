package Bank_Management;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banking {
    private Map<String, AccountDetails> accounts = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addUser() {
        System.out.print("Enter account number: ");
        String accNo = scanner.next();
        System.out.print("Enter name: ");
        String name = scanner.next();

        double balance = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter initial balance: ");
            try {
                balance = scanner.nextDouble();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for the balance.");
                scanner.next(); // Clear the invalid input
            }
        }

        accounts.put(accNo, new AccountDetails(accNo, name, balance));
        System.out.println("User added successfully.");
    }

    public void viewUser() {
        System.out.print("Enter account number: ");
        String accNo = scanner.next();
        AccountDetails account = accounts.get(accNo);

        if (account != null) {
            System.out.println("Account Number: " + account.accNo);
            System.out.println("Name: " + account.name);
            System.out.println("Balance: " + account.balance);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void deposit() {
        System.out.print("Enter account number: ");
        String accNo = scanner.next();
        AccountDetails account = accounts.get(accNo);

        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            new AmountDeposit().deposit(account, amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw() {
        System.out.print("Enter account number: ");
        String accNo = scanner.next();
        AccountDetails account = accounts.get(accNo);

        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            new AmountWithdraw().withdraw(account, amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance() {
        System.out.print("Enter account number: ");
        String accNo = scanner.next();
        AccountDetails account = accounts.get(accNo);

        if (account != null) {
            System.out.println("Current balance: " + account.balance);
        } else {
            System.out.println("Account not found.");
        }
    }
}