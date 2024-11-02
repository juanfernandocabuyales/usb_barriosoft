package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Inventario;
import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.dto.InventarioDto;
import co.edu.barriosoft.barriosoft.dto.ProductoDto;

import java.util.List;

public class InventarioMapper {

    public static InventarioDto domainToDto(Inventario inventario){
        return InventarioDto.builder()
                .idInventario(inventario.getIdInventario())
                .idProducto(null == inventario.getProductoInventario() ? null : inventario.getProductoInventario().getIdProducto())
                .cantidadDisponibleInventario(inventario.getCantidadDisponibleInventario())
                .idUnidad(null == inventario.getUnidadInventario() ? null : inventario.getUnidadInventario().getIdUnidad())
                .idTienda(null == inventario.getTiendaInventario() ? null : inventario.getTiendaInventario().getIdTienda())
                .build();
    }

    public static Inventario dtoToDomain(InventarioDto inventarioDto){
        return Inventario.builder()
                .idInventario(inventarioDto.getIdInventario())
                .cantidadDisponibleInventario(inventarioDto.getCantidadDisponibleInventario())
                .build();
    }

    public static List<InventarioDto> domainToDtoList(List<Inventario> inventarios){
        return inventarios.stream().map(InventarioMapper::domainToDto).toList();
    }

    public static List<Inventario> dtoToDomainList(List<InventarioDto> inventarioDtos){
        return inventarioDtos.stream().map(InventarioMapper::dtoToDomain).toList();
    }
}
