package Exception.src.com.bank_;

import java.util.Scanner;


class InsufficientFundException extends Exception {
 public InsufficientFundException(String message) {
     super(message); 
 }
}

class BankAccount {
 private double balance;

 
 public BankAccount(double balance) {
     this.balance = balance;
 }

 
 public void withdraw(double amount) throws InsufficientFundException {
     if (amount > balance) {
         throw new InsufficientFundException("Insufficient funds! You cannot withdraw more than your balance.");
     } else {
         balance -= amount; 
         System.out.println("Withdrawal successful! Remaining balance: " + balance);
     }
 }
}


public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BankAccount account = new BankAccount(1000.0); 

     System.out.print("Enter the amount to withdraw: ");
     double amount = scanner.nextDouble();

     try {
         account.withdraw(amount); 
     } catch (InsufficientFundException e) {
         System.out.println(e.getMessage()); 
     } 
 }
}
