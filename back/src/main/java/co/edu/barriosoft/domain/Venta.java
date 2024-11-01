package co.edu.barriosoft.domain;

import java.time.LocalDate;
import java.util.List;

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
@Table(name = "ventas")
@Builder
public class Venta {

	@Id
	@Column(name = "venta_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@Column(name = "venta_producto_id")
	private List<Producto> listVentaProductos;
	
	@Column(name = "venta_cantidad")
	private String ventaCantidad;
	
	@Column(name = "venta_fecha")
	private LocalDate ventaFecha;
	
	@Column(name = "venta_tienda_id")
	private Tienda ventaTienda;
	
	@Column(name = "venta_estado")
	private Boolean venta_estado;
}
