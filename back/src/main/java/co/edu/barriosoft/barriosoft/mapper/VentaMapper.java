package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Inventario;
import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.domain.Venta;
import co.edu.barriosoft.barriosoft.dto.InventarioDto;
import co.edu.barriosoft.barriosoft.dto.VentaDto;

import java.util.List;

public class VentaMapper {

    public static VentaDto domainToDTO(Venta venta){
        return VentaDto.builder()
                .id(venta.getId())
                .numero(venta.getNumero())
                .cantidad_productos(venta.getCantidad_productos())
                .total_sin_iva(venta.getTotal_sin_iva())
                .total_con_iva(venta.getTotal_con_iva())
                .fecha_creacion(venta.getFecha_creacion())
                .usuario_creacion(venta.getUsuario_creacion())
                .estado(venta.getEstado())
                .build();
    }

    public static Venta dTOToDomain(VentaDto ventaDTO){
        return Venta.builder()
                .id(ventaDTO.getId())
                .numero(ventaDTO.getNumero())
                .cantidad_productos(ventaDTO.getCantidad_productos())
                .total_sin_iva(ventaDTO.getTotal_sin_iva())
                .total_con_iva(ventaDTO.getTotal_con_iva())
                .fecha_creacion(ventaDTO.getFecha_creacion())
                .usuario_creacion(ventaDTO.getUsuario_creacion())
                .estado(ventaDTO.getEstado())
                .build();
    }

    public static List<VentaDto> domainDTOList(List<Venta> ventas){
        return ventas.stream().map(VentaMapper::domainToDTO).toList();
    }

    public static List<Venta> dTOToDomainList(List<VentaDto>ventaDTOs){
        return ventaDTOs.stream().map(VentaMapper:: dTOToDomain).toList();
    }

   /* private static List<Integer> obtenerIdProductos(List<Producto> productos){
        return productos.stream().map(Producto::getIdProducto).toList();
    }*/


}
