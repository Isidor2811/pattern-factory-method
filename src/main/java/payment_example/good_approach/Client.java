package payment_example.good_approach;

public class Client {

    public static void main(String[] args) {
        IPayment paymentSystem = PaymentFactory.giveMePaymentSystem("VISA");
        paymentSystem.makePayment();
    }
}
