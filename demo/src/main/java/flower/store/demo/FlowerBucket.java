package flower.store.demo;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerpack) {
        flowerPacks.add(flowerpack);
    }

    public double getPrice() {
        double total = 0;
        for (FlowerPack flowerpack : flowerPacks) {
            total += flowerpack.getPrice();
        }
        return total;
    }
}
