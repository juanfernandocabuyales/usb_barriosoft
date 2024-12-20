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
public class TiendaDto {

    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private Boolean estado;
    private Instant fecha_creacion;

}
