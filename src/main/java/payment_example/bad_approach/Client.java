package payment_example.bad_approach;

public class Client {

    public static void makePayment(String paymentMethod) {
        Payment payment = new Payment();
        if (paymentMethod.equals("VISA")) {
            payment.payWithVisa();
        } else if (paymentMethod.equals("MASTER CARD")) {
            payment.payWithMasterCard();
        } else {
            payment.payWithBankTransfer();
        }
    }

}
