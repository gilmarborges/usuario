package com.gilmar.usuario.controller;

import com.gilmar.usuario.business.UsuarioService;
import com.gilmar.usuario.business.dto.UsuarioDTO;
import com.gilmar.usuario.infrastructure.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {


    private final UsuarioService usuarioService;
    @PostMapping
    public ResponseEntity<UsuarioDTO> salvaUsuario(@RequestBody UsuarioDTO usuarioDTO){
       return ResponseEntity.ok(usuarioService.salvaUsuario(usuarioDTO));
    }
}
