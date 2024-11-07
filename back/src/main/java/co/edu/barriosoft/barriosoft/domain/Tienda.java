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
@Table(name = "tiendas")
public class Tienda {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 255, name = "nombre", nullable = true)
	private String nombre;

	@Column(length = 255, name = "direccion", nullable = true)
	private String direccion;

	@Column(length = 255, name = "telefono", nullable = true)
	private String telefono;

	@Column(name = "estado", nullable = true)
	private Boolean estado;

	@Column(name = "fecha_creacion", nullable = true)
	private Instant fecha_creacion;
}
