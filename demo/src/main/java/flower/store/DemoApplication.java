package flower.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import flower.store.demo.Flower;
import flower.store.demo.FlowerColor;
import flower.store.demo.FlowerRepository;
import flower.store.demo.FlowerType;

@SpringBootApplication
public class DemoApplication {

    private final FlowerRepository flowerRepository;
    @Autowired
    public DemoApplication(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner seedData() {
        return args -> {
            if (flowerRepository.count() == 0) {
                flowerRepository.save(new Flower(2.5, FlowerColor.BLUE, 10, FlowerType.TULIP));
                flowerRepository.save(new Flower(3.5, FlowerColor.RED, 10, FlowerType.ROSE));
                System.out.println("Sample data seeded.");
            } else {
                System.out.println("Data already exists. Skipping seeding.");
            }
        };
    }

}
