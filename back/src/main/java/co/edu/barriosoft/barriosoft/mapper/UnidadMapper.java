package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Unidad;
import co.edu.barriosoft.barriosoft.dto.UnidadDto;

import java.util.List;

public class UnidadMapper {

    public static UnidadDto domainToDto(Unidad unidad){
        return UnidadDto.builder()
                .idUnidad(unidad.getIdUnidad().toString())
                .nombre(unidad.getNombreUnidad())
                .abreviatura(unidad.getAbreviaturaUnidad())
                .descripcion(unidad.getDescripcionUnidad())
                .estado(unidad.getEstadoUnidad())
                .build();
    }

    public static Unidad dtoToDomain(UnidadDto unidadDto){
        return Unidad.builder()
                .idUnidad(Integer.parseInt(unidadDto.getIdUnidad()))
                .nombreUnidad(unidadDto.getNombre())
                .abreviaturaUnidad(unidadDto.getAbreviatura())
                .descripcionUnidad(unidadDto.getDescripcion())
                .estadoUnidad(unidadDto.getEstado())
                .build();
    }

    public static List<UnidadDto> domainToDtoList(List<Unidad> unidades){
        return unidades.stream().map(UnidadMapper::domainToDto).toList();
    }

    public static List<Unidad> dtoToDomainList(List<UnidadDto> unidadDtos){
        return unidadDtos.stream().map(UnidadMapper::dtoToDomain).toList();
    }
}
