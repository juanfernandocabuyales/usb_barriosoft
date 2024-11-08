package co.edu.barriosoft.barriosoft.service.impl;

import co.edu.barriosoft.barriosoft.domain.Usuario;
import co.edu.barriosoft.barriosoft.dto.UsuarioDto;
import co.edu.barriosoft.barriosoft.mapper.UsuarioMapper;
import co.edu.barriosoft.barriosoft.repository.UsuarioRepository;
import co.edu.barriosoft.barriosoft.service.UsuarioService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioDto> consultarUsuarios() {
       List<UsuarioDto> usuarioDtoList = new ArrayList<>();
       try{
           List<Usuario> usuariosList = usuarioRepository.findAll();
           if(!usuariosList.isEmpty()){
               usuarioDtoList = UsuarioMapper.domainToDtoList(usuariosList);
           }
       }catch (Exception e){
           log.error(e.getMessage());
       }
       return usuarioDtoList;
    }
}
