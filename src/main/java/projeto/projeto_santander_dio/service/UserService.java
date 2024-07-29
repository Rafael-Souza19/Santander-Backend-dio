package projeto.projeto_santander_dio.service;

import projeto.projeto_santander_dio.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User user);
}
