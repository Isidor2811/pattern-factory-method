package payment_example.good_approach;

public class VisaPayment implements IPayment {
    @Override
    public void makePayment() {
        System.out.println("Money transferred from Visa");
    }
}
