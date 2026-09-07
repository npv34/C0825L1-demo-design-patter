package src.CreationalDesign.Factory;

public class OrderService {
    public void processOrder(String type, double amount) {
        PaymentGateway payment = PaymentFactory.getPaymentMethod(type);
        payment.pay(amount);
    }
}
