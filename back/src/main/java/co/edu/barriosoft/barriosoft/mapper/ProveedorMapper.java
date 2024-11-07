package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Proveedor;
import co.edu.barriosoft.barriosoft.domain.Unidad;
import co.edu.barriosoft.barriosoft.dto.ProveedorDto;
import co.edu.barriosoft.barriosoft.dto.UnidadDto;

import java.util.List;

public class ProveedorMapper {

    public static ProveedorDto domainToDTO(Proveedor proveedor){
        return ProveedorDto.builder()
                .id(proveedor.getId())
                .nit(proveedor.getNit())
                .razon_social(proveedor.getRazon_social())
                .telefono((proveedor.getTelefono()))
                .direccion(proveedor.getDireccion())
                .fecha_creacion(proveedor.getFecha_creacion())
                .estado(proveedor.getEstado())
                .build();
    }

    public static Proveedor dTOToDomain(ProveedorDto proveedorDTO){
        return Proveedor.builder()
                .id(proveedorDTO.getId())
                .nit(proveedorDTO.getNit())
                .razon_social(proveedorDTO.getRazon_social())
                .telefono((proveedorDTO.getTelefono()))
                .direccion(proveedorDTO.getDireccion())
                .fecha_creacion(proveedorDTO.getFecha_creacion())
                .estado(proveedorDTO.getEstado())
                .build();
    }

    public static List<ProveedorDto> domainDTOList(List<Proveedor> proveedors){
        return proveedors.stream().map(ProveedorMapper::domainToDTO).toList();
    }

    public static List<Proveedor> dTOToDomainList(List<ProveedorDto> proveedorDTOs){
        return  proveedorDTOs.stream().map(ProveedorMapper::dTOToDomain).toList();
    }

    /*public static Proveedor createProveedorRequestToDomain(CreateProveedorRequest createProveedorRequest){
        return Proveedor.builder()
                .nit(createProveedorRequest.getNit())
                .razon_social(createProveedorRequest.getRazon_social())
                .telefono(createProveedorRequest.getTelefono())
                .direccion(createProveedorRequest.getDireccion())
                .fecha_creacion(createProveedorRequest.getFecha_creacion())
                .estado(createProveedorRequest.getEstado())
                .build();
    }*/
}
