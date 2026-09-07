package src.CreationalDesign.Factory;

public class CODPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan khi nhan hang: " + amount);
    }
}
