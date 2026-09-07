package src.CreationalDesign.Factory;

public class ZaloPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan qua ZaloPay: " + amount);
    }
}
