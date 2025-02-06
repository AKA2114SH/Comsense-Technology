package interface_payment_system;

public class PayPalPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Amount: "+ amount+" payed successfull.");
		
	}

	@Override
	public void refund(double amount) {
		System.out.println("Amount: "+ amount+" refunded successfull.");
		
	}

}
