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
public class CargueDto {

    private Integer id;
    private Integer creado_por;
    private Instant fecha_creacion;
    private Boolean estado;
    private Integer proveedorId;
}



