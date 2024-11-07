package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.CargueDto;
import co.edu.barriosoft.barriosoft.mapper.CargueMapper;
import co.edu.barriosoft.barriosoft.repository.CargueRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cargue")
public class CargueController {

    private final CargueRepository cargueRepository;

    public CargueController(CargueRepository cargueRepository) {
        this.cargueRepository = cargueRepository;
    }

    @GetMapping(value = "/ping")
    public String pingPong(){
        return "pong";
    }

    @GetMapping(value = "/all")
    public List<CargueDto> getCargue(){
        return CargueMapper.domainDTOList(cargueRepository.findAll());
    }
}
