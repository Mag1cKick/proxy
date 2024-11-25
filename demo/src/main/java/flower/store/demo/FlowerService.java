package flower.store.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    public Optional<Flower> getFlowerById(Long id) {
        return flowerRepository.findById(id);
    }

    public Flower saveFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    public void deleteFlower(Long id) {
        flowerRepository.deleteById(id);
    }
}