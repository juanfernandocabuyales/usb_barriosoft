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
@Table(name = "productos")
@Builder
public class Producto {

	@Id
	@Column(name = "producto_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@Column(name = "producto_nombre")
	private String nombreProducto;
	
	@Column(name = "producto_descripcion")
	private String productoDescripcion;
	
	@Column(name = "producto_proveedor_id")
	private Proveedor productoProveedor;
	
	@Column(name = "producto_unidad_id")
	private Unidad unidadProducyo;
	
	@Column(name = "producto_estado")
	private Boolean estadoProducto;
}
