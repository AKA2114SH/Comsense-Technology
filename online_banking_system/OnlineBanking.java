package online_banking_system;

public class OnlineBanking {

	public static void main(String[] args) {
		SavingAccount s=new SavingAccount("acc72727", 3.2);
		s.deposite(30000);
//		s.withdraw(3000);
	System.out.println("Account number: "+s.accountNo);
	System.out.println("Initial balance: "+s.balance);
	s.applyInterest();
	System.out.println("Final balance: "+s.balance);

	}

}
