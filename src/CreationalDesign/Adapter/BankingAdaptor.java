package src.CreationalDesign.Adapter;


public class BankingAdaptor implements PaymentProcess {
    @Override
    public void processPayment(String fromAccount, String toAccount, double amount, String monneyType) {
        if (monneyType == "USD") {
            amount = amount * 240;
        }
        BankingApp.transferMoney(fromAccount, toAccount, amount);
    }
}
