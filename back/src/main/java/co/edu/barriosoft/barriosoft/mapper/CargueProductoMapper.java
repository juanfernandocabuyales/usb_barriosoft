package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.CargueProducto;
import co.edu.barriosoft.barriosoft.domain.Precio;
import co.edu.barriosoft.barriosoft.dto.CargueProductoDTO;
import co.edu.barriosoft.barriosoft.dto.PrecioDTO;

import java.util.Date;
import java.util.List;

public class CargueProductoMapper {
    public static CargueProductoDTO domainToDTO(CargueProducto cargueProducto){
        return CargueProductoDTO.builder()
                .id(cargueProducto.getId())
                .cantidad(cargueProducto.getCantidad())
                .cargueInventario(cargueProducto.isCargueInventario())
                .fechaCargueInventario(cargueProducto.getFechaCargueInventario())
                .productoId(cargueProducto.getProducto().getId())
                .cargueId(cargueProducto.getCargue().getId())
                .build();
    }
    public static CargueProducto dTOTodomain(CargueProductoDTO cargueProducto){
        return CargueProducto.builder()
                .id(cargueProducto.getId())
                .cantidad(cargueProducto.getCantidad())
                .cargueInventario(cargueProducto.isCargueInventario())
                .fechaCargueInventario(cargueProducto.getFechaCargueInventario())
                .build();
    }
    public static List<CargueProductoDTO> domainToDTOList(List<CargueProducto> productos){
        return productos.stream().map(CargueProductoMapper::domainToDTO).toList();

    }
    public static List<CargueProducto> dTOTodomainList(List<CargueProductoDTO> productos){
        return productos.stream().map(CargueProductoMapper::dTOTodomain).toList();

    }

}
