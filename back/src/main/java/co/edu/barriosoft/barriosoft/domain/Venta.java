package co.edu.barriosoft.barriosoft.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ventas")
public class Venta {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 255, name = "numero", nullable = true)
	private String numero;

	@Column(name = "cantidad_productos", nullable = true)
	private Integer cantidad_productos;

	@Column(name = "total_sin_iva", precision = 18, scale = 2, nullable = true)
	private BigDecimal total_sin_iva;

	@Column(name = "total_con_iva", precision = 18, scale = 2, nullable = true)
	private BigDecimal total_con_iva;

	@Column(name = "fecha_creacion", nullable = true)
	private Instant fecha_creacion;

	@Column(name = "usuario_creacion", nullable = true)
	private Integer usuario_creacion;

	@Column(name = "estado", nullable = true)
	private Boolean estado;
}
