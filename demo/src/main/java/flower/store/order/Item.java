package flower.store.order;

import flower.store.demo.Flower;

public class Item {
    private Flower flower;
    private int quantity;

    public Item(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return flower.getPrice() * quantity;
    }
}
