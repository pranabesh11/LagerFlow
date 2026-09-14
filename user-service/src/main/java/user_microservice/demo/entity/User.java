package user_microservice.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import jakarta.validation.constraints.Email;


@Entity
@Table(name = "Users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    enum Roles{
        ADMIN,
        MANAGER
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private String role;
    @Email(message = "Please provide a valid email address")
    @NotBlank(message = "Email is mandatory.")
    @Column(nullable = false, unique = true)
    private String email;
    private String password;
}
