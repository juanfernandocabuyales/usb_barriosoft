package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.CargueProducto;
import co.edu.barriosoft.barriosoft.domain.Venta;
import co.edu.barriosoft.barriosoft.domain.VentaProducto;
import co.edu.barriosoft.barriosoft.dto.CargueProductoDTO;
import co.edu.barriosoft.barriosoft.dto.VentaProductoDTO;

import java.util.Date;

public class VentaProductoMapper {
    public VentaProductoDTO domaintToDTO(VentaProducto ventaProducto){
        return VentaProductoDTO.builder()
                .id(ventaProducto.getId())
                .cantidad(ventaProducto.getCantidad())
                .total(ventaProducto.getTotal())
                .fechaCreacion(ventaProducto.getFechaCreacion())
                .estado(ventaProducto.isEstado())
                .venta(ventaProducto.getVenta())
                .productoId(ventaProducto.getProducto().getId())
                .precioId(ventaProducto.getPrecio().getId())
                .build();
    }
    public VentaProducto dTOTodomain(CargueProductoDTO cargueProductoDTO){
        return null;
    }
}
