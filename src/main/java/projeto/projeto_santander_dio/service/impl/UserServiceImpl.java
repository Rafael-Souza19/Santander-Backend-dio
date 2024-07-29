package projeto.projeto_santander_dio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.projeto_santander_dio.domain.model.User;
import projeto.projeto_santander_dio.repository.UserRepository;
import projeto.projeto_santander_dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            // Inicializa coleções
            user.getFeatures().size();
            user.getNews().size();
        }
        return user;
    }

    @Override
    public User create(User userToCreate) {
        return userRepository.save(userToCreate);
    }
}
