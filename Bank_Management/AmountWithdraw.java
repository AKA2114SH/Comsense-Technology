package Bank_Management;
public class AmountWithdraw {
    public void withdraw(AccountDetails account, double amount) {
        if (account.balance - amount >= 5000) {
            account.balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + account.balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}