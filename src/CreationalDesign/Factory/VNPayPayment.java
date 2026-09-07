package src.CreationalDesign.Factory;

public class VNPayPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan qua VNPAY: " + amount);
    }
}
