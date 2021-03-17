package payment_example.good_approach;

public class PaymentFactory {

    public static IPayment giveMePaymentSystem(String paymentMethod) {
        if (paymentMethod.equals("VISA")) {
            return new VisaPayment();
        } else if (paymentMethod.equals("MASTER CARD")) {
            return new MasterCardPayment();
        } else {
            return new BankTransferPayment();
        }
    }

}
