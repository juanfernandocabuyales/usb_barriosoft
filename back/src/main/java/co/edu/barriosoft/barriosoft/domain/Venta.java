package co.edu.barriosoft.barriosoft.domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ventas")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Venta {

	@Id
	@Column(name = "venta_id",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@Column(name = "venta_producto_id")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idProducto")
	private List<Producto> listVentaProductos;
	
	@Column(name = "venta_cantidad")
	private Integer ventaCantidad;
	
	@Column(name = "venta_fecha")
	private LocalDate ventaFecha;
	
	@ManyToOne
	@JoinColumn(name = "venta_tienda_id", referencedColumnName = "tienda_id")
	private Tienda ventaTienda;
	
	@Column(name = "venta_estado")
	private Boolean ventaEstado;
}
