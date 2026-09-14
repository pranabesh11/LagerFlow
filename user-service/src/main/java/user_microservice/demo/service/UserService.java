package user_microservice.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import user_microservice.demo.DTO.UserRequest;
import user_microservice.demo.entity.User;
import user_microservice.demo.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    @Transactional
    public boolean createUser(UserRequest userRequest){
        if(userRequest != null){
            User user = new User();
            user.setName(userRequest.getName());
            user.setEmail(userRequest.getEmail());
            user.setRole(userRequest.getRole());
            user.setPassword(userRequest.getPassword());
            userRepository.save(user);
        }
        return true;
    }
}
