package co.edu.barriosoft.barriosoft.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CargueProductoDTO {
    private Integer id;
    private Integer cantidad;
    private boolean cargueInventario;
    private Date fechaCargueInventario;
    private Integer productoId;
    private Integer cargueId;
}
