package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.UsuarioDto;
import co.edu.barriosoft.barriosoft.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping(value = "/consultar")
    public List<UsuarioDto> consultar() {
        return usuarioService.consultarUsuarios();
    }
}
