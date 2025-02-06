package interface_payment_system;

public class StartPaymentSystem {

	public static void main(String[] args) {
		Payment p=null;
		p=new CreditCardPayment();
		p.pay(3000);
		p.refund(200);
		
		p=new PayPalPayment();
		p.refund(3000);
		p.pay(40000);

	}

}
