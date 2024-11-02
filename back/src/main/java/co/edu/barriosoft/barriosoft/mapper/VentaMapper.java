package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Inventario;
import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.domain.Venta;
import co.edu.barriosoft.barriosoft.dto.InventarioDto;
import co.edu.barriosoft.barriosoft.dto.VentaDto;

import java.util.List;

public class VentaMapper {

    public static VentaDto domainToDto(Venta venta){
        return VentaDto.builder()
                .idVenta(venta.getIdVenta())
                .ventaCantidad(venta.getVentaCantidad())
                .ventaFecha(venta.getVentaFecha())
                .idVentaTienda(null == venta.getVentaTienda() ? null : venta.getVentaTienda().getIdTienda())
                .ventaEstado(venta.getVentaEstado())
                .listIdProductos(obtenerIdProductos(venta.getListVentaProductos()))
                .build();
    }

    private static Venta dtoToDomain(VentaDto ventaDto){
        return Venta.builder()
                .idVenta(ventaDto.getIdVenta())
                .ventaCantidad(ventaDto.getVentaCantidad())
                .ventaFecha(ventaDto.getVentaFecha())
                .ventaEstado(ventaDto.getVentaEstado())
                .build();
    }

    private static List<Integer> obtenerIdProductos(List<Producto> productos){
        return productos.stream().map(Producto::getIdProducto).toList();
    }

    public static List<VentaDto> domainToDtoList(List<Venta> ventas){
        return ventas.stream().map(VentaMapper::domainToDto).toList();
    }

    public static List<Venta> dtoToDomainList(List<VentaDto> ventaDtos){
        return ventaDtos.stream().map(VentaMapper::dtoToDomain).toList();
    }
}
