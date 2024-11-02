package co.edu.barriosoft.barriosoft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProveedorDto {

    private Integer idProveedor;

    private String nombreProveedor;

    private String telefonoProveedor;

    private String direccionProveedor;

    private Boolean estadoProveedor;
}
