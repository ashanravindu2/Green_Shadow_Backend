package lk.ijse.greenshadowbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    // why using Enumerated ?
    // Enumerated is used to map the enum type attribute in the entity class.
    private Role role;
}
