package co.edu.barriosoft.barriosoft.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "productos")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "tiendasid", referencedColumnName = "id")
	private Tienda tienda;

	@ManyToOne
	@JoinColumn(name = "proveedoresid", referencedColumnName = "id")
	private Proveedor proveedor;

	@Size(max = 255)
	@Column(name = "codigo_externo")
	private String codigoExterno;

	@Size(max = 255)
	@Column(name = "codigo_interno")
	private String codigoInterno;

	@Size(max = 255)
	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "precio_actual")
	private Double precioActual;

	@Column(name = "estado")
	private Boolean estado;

	@Column(name = "fecha_creacion")
	private LocalDate fechaCreacion;

	@ManyToOne
	@JoinColumn(name = "usuario_creacion", referencedColumnName = "id")
	private Usuario usuarioCreacion;
}
