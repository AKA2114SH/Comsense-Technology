package Bank_Management;
public class AmountDeposit {
    public void deposit(AccountDetails account, double amount) {
        account.balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + account.balance);
    }
}