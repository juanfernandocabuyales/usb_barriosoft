package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.UnidadDto;
import co.edu.barriosoft.barriosoft.service.UnidadService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/unidad")
@AllArgsConstructor
public class UnidadController {

    private final UnidadService unidadService;

    @GetMapping("/consultarUnidades")
    public ResponseEntity<List<UnidadDto>> consultarUnidades(){
        return ResponseEntity.ok(unidadService.consultarUnidades());
    }
}
