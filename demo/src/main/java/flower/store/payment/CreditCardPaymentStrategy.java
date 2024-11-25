package flower.store.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        // Implement credit card payment logic here
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}