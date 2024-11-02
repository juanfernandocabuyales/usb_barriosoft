package co.edu.barriosoft.barriosoft.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "proveedores")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {

	@Id
	@Column(name = "proveedor_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProveedor;
	
	@Column(name = "proveedor_nombre")
	private String nombreProveedor;
	
	@Column(name = "proveedor_contacto")
	private String telefonoProveedor;
	
	@Column(name = "proveedor_direccion")
	private String direccionProveedor;
	
	@Column(name = "proveedor_estado")
	private Boolean estadoProveedor;
}
