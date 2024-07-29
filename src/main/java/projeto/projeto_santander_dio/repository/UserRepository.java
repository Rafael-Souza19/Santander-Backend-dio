package projeto.projeto_santander_dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.projeto_santander_dio.domain.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
}
