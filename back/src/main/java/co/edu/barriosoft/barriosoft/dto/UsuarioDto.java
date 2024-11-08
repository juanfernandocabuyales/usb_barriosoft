package co.edu.barriosoft.barriosoft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDto {

    private Integer id;

    private String nombre;

    private String apellido;

    private String usuario;

    private String clave;

    private String fechaCreacion;

    private Integer idUsuarioCreacion;

    private Boolean estado;

    private Integer idTienda;
}
