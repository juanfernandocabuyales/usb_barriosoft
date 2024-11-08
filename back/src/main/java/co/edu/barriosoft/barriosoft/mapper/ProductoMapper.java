package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.domain.Proveedor;
import co.edu.barriosoft.barriosoft.domain.Tienda;
import co.edu.barriosoft.barriosoft.domain.Usuario;
import co.edu.barriosoft.barriosoft.dto.ProductoDto;
import co.edu.barriosoft.barriosoft.dto.ProveedorDto;
import co.edu.barriosoft.barriosoft.utils.FechaUtils;

import java.time.LocalDate;
import java.util.List;

public class ProductoMapper {

    public static ProductoDto domainToDto(Producto producto){
        return ProductoDto.builder()
                .idProducto(producto.getId())
                .codigoExterno(producto.getCodigoExterno())
                .codigoInterno(producto.getCodigoInterno())
                .descripcion(producto.getDescripcion())
                .precioActual(producto.getPrecioActual())
                .estadoProducto(producto.getEstado())
                .fechaCreacion(FechaUtils.formatearFecha(producto.getFechaCreacion(),FechaUtils.FORMATO_FECHA))
                .idUsuarioCreacion(producto.getUsuarioCreacion().getId().longValue())
                .idTienda(producto.getTienda().getId().longValue())
                .idProveedor(producto.getProveedor().getId().longValue())
                .build();
    }

    public static Producto dtoToDomain(ProductoDto productoDto){
        return Producto.builder()
                .id(productoDto.getIdProducto())
                .tienda(Tienda.builder().id(productoDto.getIdTienda().intValue()).build())
                .proveedor(Proveedor.builder().id(productoDto.getIdProveedor().intValue()).build())
                .codigoExterno(productoDto.getCodigoExterno())
                .codigoInterno(productoDto.getCodigoInterno())
                .descripcion(productoDto.getDescripcion())
                .precioActual(productoDto.getPrecioActual())
                .estado(productoDto.getEstadoProducto())
                .fechaCreacion(LocalDate.now())
                .usuarioCreacion(Usuario.builder().id(productoDto.getIdUsuarioCreacion().intValue()).build())
                .build();
    }

    public static List<ProductoDto> domainToDtoList(List<Producto> productos){
        return productos.stream().map(ProductoMapper::domainToDto).toList();
    }

    public static List<Producto> dtoToDomainList(List<ProductoDto> productoDtoList){
        return productoDtoList.stream().map(ProductoMapper::dtoToDomain).toList();
    }
}
