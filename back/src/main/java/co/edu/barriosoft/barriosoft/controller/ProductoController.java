package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.ProductoDto;
import co.edu.barriosoft.barriosoft.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
@AllArgsConstructor
public class ProductoController {

    private ProductoService productoService;

    @GetMapping(value = "/consultar")
    public List<ProductoDto> consultar() {
        return productoService.consultarProductos();
    }
}
