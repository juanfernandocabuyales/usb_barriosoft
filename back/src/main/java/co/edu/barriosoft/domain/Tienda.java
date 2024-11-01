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
@Table(name = "tiendas")
@Builder
public class Tienda {

	@Id
	@Column(name = "tienda_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTienda;
	
	@Column(name = "tienda_nombre")
	private String nombreTienda;
	
	@Column(name = "tienda_direccion")
	private String direccionTienda;
	
	@Column(name = "tienda_telefono")
	private String telefonoTienda;
	
	@Column(name = "tienda_estado")
	private Boolean tiendaEstado;
}
