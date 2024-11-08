package co.edu.barriosoft.barriosoft.service.impl;

import co.edu.barriosoft.barriosoft.domain.Inventario;
import co.edu.barriosoft.barriosoft.dto.InventarioDto;
import co.edu.barriosoft.barriosoft.mapper.InventarioMapper;
import co.edu.barriosoft.barriosoft.repository.InventarioRepository;
import co.edu.barriosoft.barriosoft.service.InventarioService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class InventarioServiceImpl implements InventarioService {

    private final InventarioRepository inventarioRepository;

    @Override
    public List<InventarioDto> consultarInventarios() {
        List<InventarioDto> inventarioDtoList = new ArrayList<>();
        try{
            List<Inventario> inventariosList = inventarioRepository.findAll();
            if(!inventariosList.isEmpty()){
                inventarioDtoList = InventarioMapper.domainToDtoList(inventariosList);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return inventarioDtoList;
    }
}
