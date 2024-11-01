package co.edu.barriosoft.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "unidades")
@Builder
public class Unidad {

	@Id
	@Column(name ="unidad_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUnidad;
	
	@Column(name = "nombre_unidad")
	private String nombreUnidad;
	
	@Column(name = "abreviatura_unidad")
	private String abreviaturaUnidad;
	
	@Column(name = "descripcion_unidad")
	private String descripcionUnidad;
	
	@Column(name = "estado_unidad")
	private Boolean estadoUnidad;
}
