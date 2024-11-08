package co.edu.barriosoft.barriosoft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InventarioDto {

    private Integer idInventario;

    private String lote;

    private Integer cantidad;

    private String fechaActualizacion;

    private Integer idProducto;
}
