package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.domain.Proveedor;
import co.edu.barriosoft.barriosoft.dto.ProductoDto;
import co.edu.barriosoft.barriosoft.dto.ProveedorDto;

import java.util.List;

public class ProductoMapper {

    public static ProductoDto domainToDto(Producto producto){
        return ProductoDto.builder()
                .idProducto(producto.getIdProducto())
                .nombreProducto(producto.getNombreProducto())
                .productoDescripcion(producto.getProductoDescripcion())
                .idProveedor(null == producto.getProductoProveedor() ? null : producto.getProductoProveedor().getIdProveedor())
                .idUnidad(null == producto.getUnidadProducto() ? null : producto.getUnidadProducto().getIdUnidad())
                .estadoProducto(producto.getEstadoProducto())
                .build();
    }

    public static Producto dtoToDomain(ProductoDto productoDto){
        return Producto.builder()
                .idProducto(productoDto.getIdProducto())
                .nombreProducto(productoDto.getNombreProducto())
                .productoDescripcion(productoDto.getProductoDescripcion())
                .estadoProducto(productoDto.getEstadoProducto())
                .build();
    }

    public static List<ProductoDto> domainToDtoList(List<Producto> productos){
        return productos.stream().map(ProductoMapper::domainToDto).toList();
    }

    public static List<Producto> dtoToDomainList(List<ProductoDto> productoDtoList){
        return productoDtoList.stream().map(ProductoMapper::dtoToDomain).toList();
    }
}
