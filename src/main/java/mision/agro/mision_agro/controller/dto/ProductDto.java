package mision.agro.mision_agro.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer categoryId;
    private Integer userId;
    private String imagenUrl;
}
