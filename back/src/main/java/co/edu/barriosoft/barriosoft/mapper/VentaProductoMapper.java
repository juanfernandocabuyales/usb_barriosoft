package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.*;
import co.edu.barriosoft.barriosoft.dto.CargueProductoDTO;
import co.edu.barriosoft.barriosoft.dto.VentaProductoDTO;

import java.util.Date;
import java.util.List;

public class VentaProductoMapper {
    public static VentaProductoDTO domainToDTO(VentaProducto ventaProducto){
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
    public static VentaProducto dTOTodomain(VentaProductoDTO ventaProducto){
        return VentaProducto.builder()
                .id(ventaProducto.getId())
                .cantidad(ventaProducto.getCantidad())
                .total(ventaProducto.getTotal())
                .fechaCreacion(ventaProducto.getFechaCreacion())
                .estado(ventaProducto.isEstado())
                .producto(Producto.builder().id(ventaProducto.getProductoId().intValue()).build())
                .precio(Precio.builder().id(ventaProducto.getPrecioId().intValue()).build())
                .venta(Venta.builder().id(ventaProducto.getVenta().getId().intValue()).build())
                .build();
    }
    public static List<VentaProductoDTO> domainToDTOList(List<VentaProducto> ventaProductos){
        return ventaProductos.stream().map(VentaProductoMapper::domainToDTO).toList();

    }
    public static List<VentaProducto> dTOTodomainList(List<VentaProductoDTO> ventaProductos){
        return ventaProductos.stream().map(VentaProductoMapper::dTOTodomain).toList();

    }
}
