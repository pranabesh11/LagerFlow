package user_microservice.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import user_microservice.demo.DTO.UserRequest;
import user_microservice.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @PostMapping("/createuser")
    public boolean createUser(@RequestParam UserRequest userRequest){
        userService.createUser(userRequest);
        return true;
    }
}
