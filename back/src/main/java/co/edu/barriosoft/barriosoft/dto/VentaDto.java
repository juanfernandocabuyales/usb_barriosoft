package co.edu.barriosoft.barriosoft.dto;

import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.domain.Tienda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaDto {
    private Integer id;
    private String numero;
    private Integer cantidad_productos;
    private BigDecimal total_sin_iva;
    private BigDecimal total_con_iva;
    private Instant fecha_creacion;
    private Integer usuario_creacion;
    private Boolean estado;
}
