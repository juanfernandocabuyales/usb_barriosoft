package co.edu.barriosoft.barriosoft.controller;

import co.edu.barriosoft.barriosoft.dto.PrecioDTO;
import co.edu.barriosoft.barriosoft.dto.request.CreatePrecioRequest;
import co.edu.barriosoft.barriosoft.mapper.PrecioMapper;
import co.edu.barriosoft.barriosoft.repository.PrecioRepository;
import co.edu.barriosoft.barriosoft.service.PrecioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/precio")
public class PrecioController {
    private final PrecioRepository precioRepository;
    private final PrecioService precioService;

    public PrecioController(PrecioRepository precioRepository, PrecioService precioService) {
        this.precioRepository = precioRepository;
        this.precioService = precioService;
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
    @PostMapping("/add")
    public ResponseEntity<PrecioDTO> crearPrecio(@RequestBody CreatePrecioRequest createPrecioRequest) throws Exception{
        PrecioDTO precioDTORepose = precioService.CrearPrecio(createPrecioRequest);
        return ResponseEntity.ok(precioDTORepose);
    }

}
