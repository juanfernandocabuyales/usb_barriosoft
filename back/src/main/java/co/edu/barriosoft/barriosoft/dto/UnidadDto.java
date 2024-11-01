package co.edu.barriosoft.barriosoft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UnidadDto {

	private String idUnidad;
	
	private String nombre;
	
	private String abreviatura;
	
	private String descripcion;
	
	private Boolean estado;
}
