package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Precio;
import co.edu.barriosoft.barriosoft.dto.PrecioDTO;

import java.util.ArrayList;
import java.util.List;

public class PrecioMapper {
    public static PrecioDTO domainToDTO(Precio precio){
       return PrecioDTO.builder()
               .id(precio.getId())
               .creadoPor(precio.getCreadoPor())
               .estado(precio.isEstado())
               .fechaCreacion(precio.getFechaCreacion())
               .fechaDesde(precio.getFechaDesde())
               .fechaHasta(precio.getFechaHasta())
               .precio(precio.getPrecio())
               .productoId(precio.getProducto()==null?null:precio.getProducto().getId())
               .build();
    }
    public static Precio dTOTodomain(PrecioDTO precioDTO){
        return Precio.builder()
                .id(precioDTO.getId())
                .creadoPor(precioDTO.getCreadoPor())
                .estado(precioDTO.isEstado())
                .fechaCreacion(precioDTO.getFechaCreacion())
                .fechaDesde(precioDTO.getFechaDesde())
                .fechaHasta(precioDTO.getFechaHasta())
                .precio(precioDTO.getPrecio())
                .build();
    }
    public static List<PrecioDTO> domainToDTOList(List<Precio> precios){
        //Opcon 1: seria una opcion clasica
        /*List<PrecioDTO> preciosDTO = new ArrayList<>();

        for (Precio precio: precios){
            preciosDTO.add(domaintToDTO(precio));
        }
        return  preciosDTO;*/

        //Opcion 2: se puede usar un stream()
        return precios.stream().map(PrecioMapper::domainToDTO).toList();

    }
    public static List<Precio> dTOTodomainList(List<PrecioDTO> precios){

        //Opcion 2: se puede usar un stream()
        return precios.stream().map(PrecioMapper::dTOTodomain).toList();

    }
}
