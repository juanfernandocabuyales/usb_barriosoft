package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Precio;
import co.edu.barriosoft.barriosoft.dto.PrecioDTO;

public class PrecioMapper {
    public PrecioDTO domaintToDTO(Precio precio){
       return PrecioDTO.builder()
               .id(precio.getId())
               .creadoPor(precio.getCreadoPor())
               .estado(precio.isEstado())
               .fechaCreacion(precio.getFechaCreacion())
               .fechaDesde(precio.getFechaDesde())
               .fechaHasta(precio.getFechaHasta())
               .precio(precio.getPrecio())
               .productoId(precio.getProducto().getId())
               .build();
    }
    public Precio dTOTodomain(PrecioDTO precioDTO){
        return null;
    }
}
