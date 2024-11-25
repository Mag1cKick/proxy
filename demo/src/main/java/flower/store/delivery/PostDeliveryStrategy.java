package flower.store.delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(String address) {
        // Implement postal delivery logic here
        System.out.println("Delivery to " + address + " via Postal Service.");
    }
}
