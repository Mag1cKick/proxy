package flower.store.demo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface FlowerRepository extends JpaRepositoryImplementation<Flower, Long> {
}