package co.edu.barriosoft.barriosoft.service.impl;

import co.edu.barriosoft.barriosoft.domain.Precio;
import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.dto.PrecioDTO;
import co.edu.barriosoft.barriosoft.dto.request.CreatePrecioRequest;
import co.edu.barriosoft.barriosoft.mapper.PrecioMapper;
import co.edu.barriosoft.barriosoft.repository.PrecioRepository;
import co.edu.barriosoft.barriosoft.repository.ProductoRepository;
import co.edu.barriosoft.barriosoft.service.PrecioService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrecioServiceImpl implements PrecioService {
    private  final PrecioRepository precioRepository;
    private final ProductoRepository productoRepository;

    public PrecioServiceImpl(PrecioRepository precioRepository, ProductoRepository productoRepository) {
        this.precioRepository = precioRepository;
        this.productoRepository = productoRepository;
    }

    @Override
    public PrecioDTO CrearPrecio(CreatePrecioRequest createPrecioRequest) throws Exception {
        if(createPrecioRequest==null){
            throw new Exception("El objeto Precio ha llegado NULL   ");
        }
        if(createPrecioRequest.getPrecio()==0){
            throw new Exception("El Precio ha llegado en CERO   ");
        }
        if(createPrecioRequest.getFechaDesde()==null){
            throw new Exception("LA FECHA DESDE HA LLEGADO NULL");
        }
        if(createPrecioRequest.getFechaHasta()==null){
            throw new Exception("LA FECHA HASTA HA LLEGADO NULL");
        }


        Optional<Producto> productoOptional = productoRepository.findById(createPrecioRequest.getProductoId());
        if(productoOptional.isEmpty()){
            throw new Exception("El producto no existe registrado");
        }


        Precio precio= PrecioMapper.createPrecioRequestToDomain(createPrecioRequest);
        precio.setProducto(productoOptional.get());
        precio = precioRepository.save(precio);
        return PrecioMapper.domainToDTO(precio);
    }
}
