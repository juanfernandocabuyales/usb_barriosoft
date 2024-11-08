package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.InventarioDto;
import co.edu.barriosoft.barriosoft.service.InventarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventarios")
@AllArgsConstructor
public class InventarioController {

    private InventarioService inventarioService;

    @GetMapping(value = "/consultar")
    public List<InventarioDto> consultar() {
        return inventarioService.consultarInventarios();
    }
}
