package online_banking_system;

public class SavingAccount extends BankAccount implements InterestBearing{
	double interestRate;
	public SavingAccount(String accountNo,double interestRate) {
		super(accountNo);
		this.interestRate=interestRate;
	}

	@Override
	public double calculateInterest() {
		return checkBalance()*interestRate/100;
	}
	
	public void applyInterest(){
		double interest=calculateInterest();
		deposite(interest);
		System.out.println("Interest applied: "+interest);
	}
}
