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

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "proveedores")
public class Proveedor {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 255, name = "nit", nullable = true)
	private String nit;

	@Column(length = 255, name = "razon_social", nullable = true)
	private String razon_social;

	@Column(length = 255, name = "telefono", nullable = true)
	private String telefono;

	@Column(length = 255, name = "direccion", nullable = true)
	private String direccion;

	@Column(name = "fecha_creacion", nullable = true)
	private Instant fecha_creacion;

	@Column(name = "estado", nullable = true)
	private Boolean estado;
}
