package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.PrecioDTO;
import co.edu.barriosoft.barriosoft.mapper.PrecioMapper;
import co.edu.barriosoft.barriosoft.repository.PrecioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/precio")
public class PrecioController {
    private final PrecioRepository precioRepository;

    public PrecioController(PrecioRepository precioRepository) {
        this.precioRepository = precioRepository;
    }

    @GetMapping(value = "/ping")
    public String pingPong()
    {
        return "pong";
    }

    @GetMapping(value = "/all")
    public List<PrecioDTO> getPrecios(){
        return PrecioMapper.domainToDTOList(precioRepository.findAll());
    }
}
