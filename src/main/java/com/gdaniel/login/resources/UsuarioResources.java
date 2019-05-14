package com.gdaniel.login.resources;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdaniel.login.dto.UsuarioDTO;
import com.gdaniel.login.model.Usuario;
import com.gdaniel.login.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioResources {

	@Autowired
	private UsuarioService usuarioService;
	
    @GetMapping("/users")
    public ResponseEntity<List<UsuarioDTO>> findAll() {
    	List<Usuario> usuarios = usuarioService.findAll(); 
    	List<UsuarioDTO> listDTO = usuarios.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());
       
    	return ResponseEntity.ok().body(listDTO);
    }
    
    @GetMapping("/users/{id}")
    public ResponseEntity<UsuarioDTO> findById(@PathVariable String id) {
    	Usuario usuarios = usuarioService.findById(id); 
    	
       
    	return ResponseEntity.ok().body(new UsuarioDTO(usuarios));
    }
}
