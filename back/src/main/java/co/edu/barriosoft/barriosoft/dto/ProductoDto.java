package co.edu.barriosoft.barriosoft.dto;

import co.edu.barriosoft.barriosoft.domain.Proveedor;
import co.edu.barriosoft.barriosoft.domain.Unidad;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductoDto {
    private Integer idProducto;
    private String nombreProducto;
    private String productoDescripcion;
    private Integer idProveedor;
    private Integer idUnidad;
    private Boolean estadoProducto;
}
