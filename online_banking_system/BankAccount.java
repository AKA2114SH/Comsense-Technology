package online_banking_system;

public class BankAccount {
	
	String accountNo;
	double balance;
	
	public BankAccount(String accountNo) {
		this.accountNo = accountNo;
	}

	void deposite(double amount){
		if(amount<=0){
			System.out.println("Deposite amount will be grater than 0.");
		}
		
		balance+=amount;
		System.out.println(amount+" Amount deposited.");
		System.out.println("Available balance is: "+checkBalance());
	}
	 double checkBalance(){
		return balance;
	}
	
	void withdraw(double amount){
		if(amount<=0){
			System.out.println("Withdraw amount will be grater than 0.");
		}
		if(amount<balance){
			System.out.println("Insufficient balance. ");
		}
		balance-=amount;
		System.out.println("Withdraw successfull..");
		System.out.println("Available balance is: "+checkBalance());
	}


}
