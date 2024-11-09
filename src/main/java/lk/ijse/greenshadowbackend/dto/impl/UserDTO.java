package lk.ijse.greenshadowbackend.dto.impl;

import jakarta.validation.constraints.*;
import lk.ijse.greenshadowbackend.customObj.UserResponse;
import lk.ijse.greenshadowbackend.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements UserResponse , SuperDto {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 8)
    private String password;

    @NotNull
    @Pattern(regexp = "OTHER|MANAGER|ADMINISTRATIVE|SCIENTIST")
    private String role;
}
