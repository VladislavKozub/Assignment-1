package application.Repository;

import application.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;

/**
 * Created by Cirus on 02-June-19.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
