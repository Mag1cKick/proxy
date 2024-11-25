package flower.store.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(String address) {
        // Implement DHL delivery logic here
        System.out.println("Delivery to " + address + " via DHL.");
    }
}
