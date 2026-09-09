package src.CreationalDesign.Adapter;

public interface PaymentProcess {
    void processPayment(String fromAccount, String toAccount, double amount, String monneyType);
}