package src.CreationalDesign.Factory;

// chịu trách nhiệm tạo ra đối tượng
public class PaymentFactory {
    public static PaymentGateway getPaymentMethod(String type) {
        if (type.equals("COD")) {
            return new CODPayment();
        } else if (type.equals("VNPAY")) {
            return new VNPayPayment();
        } else if (type.equals("ZALO")) {
            return new ZaloPayment();
        } else {
            throw new IllegalArgumentException("Invalid payment type: " + type);
        }
    }
}
