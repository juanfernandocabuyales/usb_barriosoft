package co.edu.barriosoft.barriosoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.barriosoft.barriosoft.dto.UnidadDto;
import co.edu.barriosoft.barriosoft.repository.UnidadRepository;
import co.edu.barriosoft.barriosoft.service.UnidadService;
import co.edu.barriosoft.barriosoft.domain.Unidad;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class UnidadServiceImpl implements UnidadService{

	private final UnidadRepository unidadRepository;
	
	@Override
	public List<UnidadDto> consultarUnidades() {
		List<UnidadDto> listDto = new ArrayList<>();
		try {
			List<Unidad> listEntidad = unidadRepository.findAll();
			if(!listEntidad.isEmpty()) {
				listEntidad.forEach(item -> listDto.add(UnidadDto.builder().idUnidad(item.getIdUnidad().toString()).nombre(item.getNombreUnidad()).descripcion(item.getDescripcionUnidad()).abreviatura(item.getAbreviaturaUnidad()).estado(item.getEstadoUnidad()).build()));
			}
		}catch(Exception e) {
			log.error("No se ha podido consultar las unidades",e);
		}
		return listDto;
	}

}
