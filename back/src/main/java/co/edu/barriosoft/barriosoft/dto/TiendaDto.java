package co.edu.barriosoft.barriosoft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TiendaDto {

    private Integer idTienda;

    private String nombreTienda;

    private String direccionTienda;

    private String telefonoTienda;

    private Boolean tiendaEstado;
}
