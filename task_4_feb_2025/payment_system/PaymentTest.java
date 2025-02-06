package task_4_feb_2025.payment_system;

public class PaymentTest {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();

        
        creditCard.pay(1000);
        creditCard.refund(200);

        payPal.pay(500);
        payPal.refund(100);
    }
}
