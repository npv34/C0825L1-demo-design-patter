package src.CreationalDesign.Adapter;


public class BankingApp {
    public static void transferMoney(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferring money from " + fromAccount + " to " + toAccount + " for " + amount);
    }
}