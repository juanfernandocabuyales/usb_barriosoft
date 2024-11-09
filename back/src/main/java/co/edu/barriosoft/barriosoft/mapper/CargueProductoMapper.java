package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.CargueProducto;
import co.edu.barriosoft.barriosoft.domain.Precio;
import co.edu.barriosoft.barriosoft.dto.CargueProductoDTO;
import co.edu.barriosoft.barriosoft.dto.PrecioDTO;

import java.util.Date;

public class CargueProductoMapper {
    public CargueProductoDTO domaintToDTO(CargueProducto cargueProducto){
        return CargueProductoDTO.builder()
                .id(cargueProducto.getId())
                .cantidad(cargueProducto.getCantidad())
                .cargueInventario(cargueProducto.isCargueInventario())
                .fechaCargueInventario(cargueProducto.getFechaCargueInventario())
                .productoId(cargueProducto.getProducto().getId())
                .cargueId(cargueProducto.getCargue().getId())
                .build();
    }
    public CargueProducto dTOTodomain(CargueProductoDTO cargueProductoDTO){
        return null;
    }
}
