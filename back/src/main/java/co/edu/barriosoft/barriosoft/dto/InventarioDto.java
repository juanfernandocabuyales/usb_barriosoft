package co.edu.barriosoft.barriosoft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InventarioDto {
    private Integer idInventario;
    private Integer idProducto;
    private Integer cantidadDisponibleInventario;
    private Integer idUnidad;
    private Integer idTienda;
}
