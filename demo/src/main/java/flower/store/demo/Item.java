package flower.store.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract  class Item {
    @Setter
    private String description;

    public abstract double getPrice();
}