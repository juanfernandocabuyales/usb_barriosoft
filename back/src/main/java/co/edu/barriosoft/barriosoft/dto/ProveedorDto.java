package co.edu.barriosoft.barriosoft.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProveedorDto {

    private Integer id;
    private String nit;
    private String razon_social;
    private String telefono;
    private String direccion;
    private Instant fecha_creacion;
    private Boolean estado;
}
