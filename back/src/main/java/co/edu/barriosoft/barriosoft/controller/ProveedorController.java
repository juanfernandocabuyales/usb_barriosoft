package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.ProveedorDto;
import co.edu.barriosoft.barriosoft.mapper.ProveedorMapper;
import co.edu.barriosoft.barriosoft.repository.ProveedorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

    private final ProveedorRepository proveedorRepository;

    public ProveedorController(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }


    @GetMapping(value = "/ping")
    public String pingPong(){
        return "pong";
    }
    @GetMapping(value = "/all")
    public List<ProveedorDto> getProveedor(){
        return ProveedorMapper.domainDTOList(proveedorRepository.findAll());
    }

}
