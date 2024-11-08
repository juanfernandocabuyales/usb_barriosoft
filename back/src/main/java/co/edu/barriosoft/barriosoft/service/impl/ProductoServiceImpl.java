package co.edu.barriosoft.barriosoft.service.impl;

import co.edu.barriosoft.barriosoft.domain.Producto;
import co.edu.barriosoft.barriosoft.dto.ProductoDto;
import co.edu.barriosoft.barriosoft.mapper.ProductoMapper;
import co.edu.barriosoft.barriosoft.repository.ProductoRepository;
import co.edu.barriosoft.barriosoft.service.ProductoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public List<ProductoDto> consultarProductos() {
        List<ProductoDto> productoDtoList = new ArrayList<>();
        try {
            List<Producto> productosList = productoRepository.findAll();
            if (!productosList.isEmpty()) {
                productoDtoList = ProductoMapper.domainToDtoList(productosList);
            }
        }catch (Exception e) {
            log.error(e.getMessage());
        }
        return productoDtoList;
    }
}
