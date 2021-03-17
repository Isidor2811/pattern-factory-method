package payment_example.good_approach;

public class BankTransferPayment implements IPayment {
    @Override
    public void makePayment() {
        System.out.println("Money transferred from Bank account");
    }
}
