package payment_example.good_approach;

public class MasterCardPayment implements IPayment {
    @Override
    public void makePayment() {
        System.out.println("Money transferred from Master card");
    }
}
