package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.VentaDto;
import co.edu.barriosoft.barriosoft.mapper.VentaMapper;
import co.edu.barriosoft.barriosoft.repository.VentaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {

    private final VentaRepository ventaRepository;

    public VentaController(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    @GetMapping(value = "/ping")
    public String pingPong(){
        return "pong";
    }

    @GetMapping(value = "/all")
    public List<VentaDto> getVenta(){
        return VentaMapper.domainDTOList(ventaRepository.findAll());
    }
}
