package mision.agro.mision_agro.controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserRequest {
    private String nombre;

    private String email;

    private String password;

    private String telefono;
}
