package com.gdaniel.login.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdaniel.login.model.Usuario;
import com.gdaniel.login.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioResources {

	@Autowired
	private UsuarioService usuarioService;
	
    @GetMapping("/users")
    public ResponseEntity<List<Usuario>> findAll() {
    	List<Usuario> usuarios = usuarioService.findAll(); 
    	
        return ResponseEntity.ok().body(usuarios);
    }
}
