package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.CargueProductoDTO;
import co.edu.barriosoft.barriosoft.dto.PrecioDTO;
import co.edu.barriosoft.barriosoft.mapper.CargueProductoMapper;
import co.edu.barriosoft.barriosoft.mapper.PrecioMapper;
import co.edu.barriosoft.barriosoft.repository.CargueProductoRepository;
import co.edu.barriosoft.barriosoft.repository.PrecioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cargueProducto")
public class CargueProductoController {
    private final CargueProductoRepository cargueProductoRepository;

    public CargueProductoController(CargueProductoRepository cargueProductoRepository) {
        this.cargueProductoRepository = cargueProductoRepository;
    }

    @GetMapping(value = "/ping")
    public String pingPong()
    {
        return "pong";
    }

    @GetMapping(value = "/all")
    public List<CargueProductoDTO> getCargueProductos(){
        return CargueProductoMapper.domainToDTOList(cargueProductoRepository.findAll());
    }
}
