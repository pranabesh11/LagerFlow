package user_microservice.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String role;
    private String email;
    private String password;
}
