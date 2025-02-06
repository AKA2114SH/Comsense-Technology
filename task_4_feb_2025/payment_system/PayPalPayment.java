package task_4_feb_2025.payment_system;

public class PayPalPayment implements Payment{

	@Override
	public void pay(double amount) {
		
		 System.out.println("Paid " + amount + " using PayPal.");
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunded " + amount + " to PayPal.");
		
	}
	

}
