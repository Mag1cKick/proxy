package flower.store.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


public interface  UserRepository extends  JpaRepositoryImplementation<AppUser, Long> {

    @Query("SELECT u FROM AppUser u WHERE u.email = ?1")
    Optional<AppUser> findUserByEmail(String email);

}
