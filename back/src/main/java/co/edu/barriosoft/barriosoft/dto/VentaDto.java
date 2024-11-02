package co.edu.barriosoft.barriosoft.dto;

import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.domain.Tienda;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
@Builder
public class VentaDto {
    private Integer idVenta;
    private List<Integer> listIdProductos;
    private Integer ventaCantidad;
    private LocalDate ventaFecha;
    private Integer idVentaTienda;
    private Boolean ventaEstado;
}
