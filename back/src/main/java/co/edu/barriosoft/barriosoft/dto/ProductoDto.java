package co.edu.barriosoft.barriosoft.dto;

import co.edu.barriosoft.barriosoft.domain.Proveedor;
import co.edu.barriosoft.barriosoft.domain.Unidad;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductoDto {

    private Integer idProducto;

    private String codigoExterno;

    private String codigoInterno;

    private String descripcion;

    private Double precioActual;

    private Boolean estadoProducto;

    private String fechaCreacion;

    private Long idUsuarioCreacion;

    private Long idTienda;

    private Long idProveedor;
}