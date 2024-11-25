package flower.store.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        // Implement PayPal payment logic here
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}