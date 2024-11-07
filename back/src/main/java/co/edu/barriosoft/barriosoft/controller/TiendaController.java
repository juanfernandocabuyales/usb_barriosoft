package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.TiendaDto;
import co.edu.barriosoft.barriosoft.mapper.TiendaMapper;
import co.edu.barriosoft.barriosoft.repository.TiendaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tienda")
public class TiendaController {

    private final TiendaRepository tiendaRepository;

    public TiendaController(TiendaRepository tiendaRepository) {
        this.tiendaRepository = tiendaRepository;
    }

    @GetMapping(value = "/ping")
    public String pingPong(){
        return "pong";
    }

    @GetMapping(value = "/all")
    public List<TiendaDto> getTienda(){
        return TiendaMapper.domainDTOList(tiendaRepository.findAll());
    }
}
