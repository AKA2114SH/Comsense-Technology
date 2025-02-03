package Bank_Management;
public class AccountDeposit {
    public String accNo;
    public String name;
    public double balance;

    public void AccountDetails(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
}