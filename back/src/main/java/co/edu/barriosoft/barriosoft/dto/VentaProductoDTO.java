package co.edu.barriosoft.barriosoft.dto;

import co.edu.barriosoft.barriosoft.domain.Venta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaProductoDTO {
    private Integer id;
    private Integer cantidad;
    private Double total;
    private Date fechaCreacion;
    private boolean estado;
    private Integer ventaId;
    private Integer productoId;
    private Integer precioId;
}
