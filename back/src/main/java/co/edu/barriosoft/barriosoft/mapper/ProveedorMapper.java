package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Proveedor;
import co.edu.barriosoft.barriosoft.domain.Unidad;
import co.edu.barriosoft.barriosoft.dto.ProveedorDto;
import co.edu.barriosoft.barriosoft.dto.UnidadDto;

import java.util.List;

public class ProveedorMapper {

    public static ProveedorDto domainToDto(Proveedor proveedor){
        return ProveedorDto.builder()
                .idProveedor(proveedor.getIdProveedor())
                .nombreProveedor(proveedor.getNombreProveedor())
                .telefonoProveedor(proveedor.getTelefonoProveedor())
                .direccionProveedor(proveedor.getDireccionProveedor())
                .estadoProveedor(proveedor.getEstadoProveedor())
                .build();
    }

    public static Proveedor dtoToDomain(ProveedorDto proveedorDto){
        return Proveedor.builder()
                .idProveedor(proveedorDto.getIdProveedor())
                .nombreProveedor(proveedorDto.getNombreProveedor())
                .telefonoProveedor(proveedorDto.getTelefonoProveedor())
                .direccionProveedor(proveedorDto.getDireccionProveedor())
                .estadoProveedor(proveedorDto.getEstadoProveedor())
                .build();
    }

    public static List<ProveedorDto> domainToDtoList(List<Proveedor> proveedors){
        return proveedors.stream().map(ProveedorMapper::domainToDto).toList();
    }

    public static List<Proveedor> dtoToDomainList(List<ProveedorDto> proveedorDtos){
        return proveedorDtos.stream().map(ProveedorMapper::dtoToDomain).toList();
    }
}
