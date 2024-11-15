package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Precio;
import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.domain.Proveedor;
import co.edu.barriosoft.barriosoft.dto.PrecioDTO;
import co.edu.barriosoft.barriosoft.dto.request.CreatePrecioRequest;
import co.edu.barriosoft.barriosoft.utils.Constants;
import org.yaml.snakeyaml.scanner.Constant;

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
               .precio(precio.getPrecioValor())
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
                .precioValor(precioDTO.getPrecio())
                .producto(Producto.builder().id(precioDTO.getProductoId().intValue()).build())
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
    public static Precio createPrecioRequestToDomain(CreatePrecioRequest createPrecioRequest){


        return Precio.builder()
                .precioValor(createPrecioRequest.getPrecio())
                .fechaDesde(createPrecioRequest.getFechaDesde())
                .fechaHasta(createPrecioRequest.getFechaHasta())
                .creadoPor(createPrecioRequest.getCreadoPor())
                .producto(Producto.builder().id(createPrecioRequest.getProductoId().intValue()).build())
                .estado(Constants.ESTADO_ACTIVO)
                .build();
    }
}
