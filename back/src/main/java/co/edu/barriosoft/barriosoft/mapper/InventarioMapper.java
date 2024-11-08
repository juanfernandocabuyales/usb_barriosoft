package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Inventario;
import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.dto.InventarioDto;
import co.edu.barriosoft.barriosoft.dto.ProductoDto;
import co.edu.barriosoft.barriosoft.utils.FechaUtils;

import java.time.LocalDate;
import java.util.List;

public class InventarioMapper {

    public static InventarioDto domainToDto(Inventario inventario){
        return InventarioDto.builder()
                .idInventario(inventario.getId())
                .lote(inventario.getLote())
                .cantidad(inventario.getCantidad())
                .fechaActualizacion(FechaUtils.formatearFecha(inventario.getFechaActualizacion(),FechaUtils.FORMATO_FECHA))
                .idProducto(inventario.getProducto().getId())
                .build();
    }

    public static Inventario dtoToDomain(InventarioDto inventarioDto){
        return Inventario.builder()
                .id(inventarioDto.getIdInventario())
                .lote(inventarioDto.getLote())
                .cantidad(inventarioDto.getCantidad())
                .fechaActualizacion(LocalDate.now())
                .producto(Producto.builder().id(inventarioDto.getIdProducto()).build())
                .build();
    }

    public static List<InventarioDto> domainToDtoList(List<Inventario> inventarios){
        return inventarios.stream().map(InventarioMapper::domainToDto).toList();
    }

    public static List<Inventario> dtoToDomainList(List<InventarioDto> inventarioDtos){
        return inventarioDtos.stream().map(InventarioMapper::dtoToDomain).toList();
    }
}
