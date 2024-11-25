package flower.store.demo;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket flowerbucket) {
        flowerBuckets.add(flowerbucket);
    }

    public List<FlowerPack> search(FlowerType flowerType) {
        List<FlowerPack> res = new ArrayList<>();
        for (FlowerBucket bucket : flowerBuckets) {
            for (FlowerPack flowerpack : bucket.getFlowerPacks()) {
                if (flowerpack.getFlower().getFlowerType()
                == flowerType) {
                    res.add(flowerpack);
                }
            }
        }
        return res;
    }
}
