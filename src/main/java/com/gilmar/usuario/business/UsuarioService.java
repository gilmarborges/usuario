package com.gilmar.usuario.business;

import com.gilmar.usuario.business.converter.UsuarioConverter;
import com.gilmar.usuario.business.dto.UsuarioDTO;
import com.gilmar.usuario.infrastructure.entity.Usuario;
import com.gilmar.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }


}
