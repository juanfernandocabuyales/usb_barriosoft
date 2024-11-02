package co.edu.barriosoft.barriosoft.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "productos")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

	@Id
	@Column(name = "producto_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@Column(name = "producto_nombre")
	private String nombreProducto;
	
	@Column(name = "producto_descripcion")
	private String productoDescripcion;
	
	@ManyToOne
	@JoinColumn(name = "producto_proveedor_id", referencedColumnName = "proveedor_id")
	private Proveedor productoProveedor;

	@ManyToOne
	@JoinColumn(name = "producto_unidad_id", referencedColumnName = "unidad_id")
	private Unidad unidadProducto;
	
	@Column(name = "producto_estado")
	private Boolean estadoProducto;
}
