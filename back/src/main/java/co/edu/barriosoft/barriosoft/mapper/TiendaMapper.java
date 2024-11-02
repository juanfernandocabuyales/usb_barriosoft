package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Tienda;
import co.edu.barriosoft.barriosoft.domain.Unidad;
import co.edu.barriosoft.barriosoft.dto.TiendaDto;
import co.edu.barriosoft.barriosoft.dto.UnidadDto;

import java.util.List;

public class TiendaMapper {

    public static TiendaDto domainToDto(Tienda tienda){
        return TiendaDto.builder()
                .idTienda(tienda.getIdTienda())
                .nombreTienda(tienda.getNombreTienda())
                .direccionTienda(tienda.getDireccionTienda())
                .telefonoTienda(tienda.getTelefonoTienda())
                .tiendaEstado(tienda.getTiendaEstado())
                .build();
    }

    public static Tienda dtoToDomain(TiendaDto tiendaDto){
        return Tienda.builder()
                .idTienda(tiendaDto.getIdTienda())
                .nombreTienda(tiendaDto.getNombreTienda())
                .direccionTienda(tiendaDto.getDireccionTienda())
                .telefonoTienda(tiendaDto.getTelefonoTienda())
                .tiendaEstado(tiendaDto.getTiendaEstado())
                .build();
    }

    public static List<TiendaDto> domainToDtoList(List<Tienda> tiendas){
        return tiendas.stream().map(TiendaMapper::domainToDto).toList();
    }

    public static List<Tienda> dtoToDomainList(List<TiendaDto> tiendaDtos){
        return tiendaDtos.stream().map(TiendaMapper::dtoToDomain).toList();
    }
}
