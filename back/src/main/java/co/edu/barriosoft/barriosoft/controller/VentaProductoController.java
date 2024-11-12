package co.edu.barriosoft.barriosoft.controller;


import co.edu.barriosoft.barriosoft.dto.PrecioDTO;
import co.edu.barriosoft.barriosoft.dto.VentaProductoDTO;
import co.edu.barriosoft.barriosoft.mapper.PrecioMapper;
import co.edu.barriosoft.barriosoft.mapper.VentaProductoMapper;
import co.edu.barriosoft.barriosoft.repository.PrecioRepository;
import co.edu.barriosoft.barriosoft.repository.VentaProductoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ventaProducto")
public class VentaProductoController {
    private final VentaProductoRepository ventaProductoRepository;

    public VentaProductoController(VentaProductoRepository ventaProductoRepository) {
        this.ventaProductoRepository = ventaProductoRepository;
    }
    @GetMapping(value = "/ping")
    public String pingPong()
    {
        return "pong";
    }

    @GetMapping(value = "/all")
    public List<VentaProductoDTO> getVentaProductos(){
        return VentaProductoMapper.domainToDTOList(ventaProductoRepository.findAll());
    }
}
