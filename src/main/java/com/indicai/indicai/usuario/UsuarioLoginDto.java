package com.indicai.indicai.usuario;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioLoginDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
