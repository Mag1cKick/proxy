package flower.store.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flower.store.demo.Flower;
import flower.store.demo.FlowerService;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {

    @Autowired
    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers(){
        return flowerService.getAllFlowers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Flower> getFlowerById(@PathVariable Long id) {
        return flowerService.getFlowerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Flower> createFlower(@RequestBody Flower flower) {
        Flower savedFlower = flowerService.saveFlower(flower);
        return new ResponseEntity<>(savedFlower, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlower(@PathVariable Long id) {
        flowerService.deleteFlower(id);
        return ResponseEntity.noContent().build();
    }
}
