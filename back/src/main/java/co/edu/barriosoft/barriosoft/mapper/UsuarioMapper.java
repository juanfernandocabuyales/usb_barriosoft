package co.edu.barriosoft.barriosoft.mapper;

import co.edu.barriosoft.barriosoft.domain.Tienda;
import co.edu.barriosoft.barriosoft.domain.Usuario;
import co.edu.barriosoft.barriosoft.dto.UsuarioDto;
import co.edu.barriosoft.barriosoft.utils.FechaUtils;

import java.time.LocalDate;
import java.util.List;

public class UsuarioMapper {

    public static UsuarioDto domainToDto(Usuario usuario){
        return UsuarioDto.builder()
                .id(usuario.getId())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .usuario(usuario.getUsuario())
                .clave(usuario.getClave())
                .fechaCreacion(FechaUtils.formatearFecha(usuario.getFechaCreacion(),FechaUtils.FORMATO_FECHA))
                .idUsuarioCreacion(usuario.getUsuarioCreacion().getId())
                .estado(usuario.getEstado())
                .idTienda(usuario.getTienda().getId())
                .build();
    }

    public static Usuario dtoToDomain(UsuarioDto usuarioDto){
        return Usuario.builder()
                .id(usuarioDto.getId())
                .nombre(usuarioDto.getNombre())
                .apellido(usuarioDto.getApellido())
                .usuario(usuarioDto.getUsuario())
                .clave(usuarioDto.getClave())
                .fechaCreacion(LocalDate.now())
                .usuarioCreacion(Usuario.builder().id(usuarioDto.getIdUsuarioCreacion()).build())
                .estado(usuarioDto.getEstado())
                .tienda(Tienda.builder().id(usuarioDto.getIdTienda()).build())
                .build();
    }

    public static List<UsuarioDto> domainToDtoList(List<Usuario> usuariosList){
        return usuariosList.stream().map(UsuarioMapper::domainToDto).toList();
    }

    public static List<Usuario> dtoToDomainList(List<UsuarioDto> usuarioDtoList){
        return usuarioDtoList.stream().map(UsuarioMapper::dtoToDomain).toList();
    }
}
