package user_microservice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import user_microservice.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
