package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Tienda;
import co.edu.barriosoft.barriosoft.dto.TiendaDto;

import java.util.List;

public class TiendaMapper {

    public static TiendaDto domainToDTO(Tienda tienda){
        return TiendaDto.builder()
                .id(tienda.getId())
                .nombre(tienda.getNombre())
                .direccion(tienda.getDireccion())
                .telefono(tienda.getTelefono())
                .estado(tienda.getEstado())
                .fecha_creacion(tienda.getFecha_creacion())
                .build();
    }

    public static Tienda dTOToDomain(TiendaDto tiendaDTO){
        return Tienda.builder()
                .id(tiendaDTO.getId())
                .nombre(tiendaDTO.getNombre())
                .direccion(tiendaDTO.getDireccion())
                .telefono(tiendaDTO.getTelefono())
                .estado(tiendaDTO.getEstado())
                .fecha_creacion(tiendaDTO.getFecha_creacion())
                .build();
    }

    public static List<TiendaDto> domainDTOList(List<Tienda>tiendas){
        return tiendas.stream().map(TiendaMapper::domainToDTO).toList();
    }

    public  static  List<Tienda> dTOToDomainlist(List<TiendaDto>tiendaDTOs){
        return tiendaDTOs.stream().map(TiendaMapper::dTOToDomain).toList();
    }
}
