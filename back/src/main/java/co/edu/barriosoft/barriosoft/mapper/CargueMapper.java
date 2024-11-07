package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Cargue;
import co.edu.barriosoft.barriosoft.dto.CargueDto;

import java.util.List;

public class CargueMapper {

    public static CargueDto domainToDTO(Cargue cargue){
        return CargueDto.builder()
                .id(cargue.getId())
                .creado_por(cargue.getCreado_por())
                .fecha_creacion(cargue.getFecha_creacion())
                .estado(cargue.getEstado())
                .proveedorId(cargue.getProveedor() == null ? null: cargue.getProveedor().getId()) /*IF TERNARIO*/
                .build();
    }

    public  static Cargue dTOToDomain(CargueDto cargueDTO){
        return  Cargue.builder()
                .id(cargueDTO.getId())
                .creado_por(cargueDTO.getCreado_por())
                .fecha_creacion(cargueDTO.getFecha_creacion())
                .estado(cargueDTO.getEstado())
                .build();
    }

    public static List<CargueDto> domainDTOList(List<Cargue>cargues){
        return cargues.stream().map(CargueMapper::domainToDTO).toList();
    }

    public static  List<Cargue> dTOToDomainList(List<CargueDto>cargueDTOs){
        return  cargueDTOs.stream().map(CargueMapper::dTOToDomain).toList();
    }
}
