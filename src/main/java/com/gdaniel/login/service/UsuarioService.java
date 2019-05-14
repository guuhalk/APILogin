package com.gdaniel.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdaniel.login.dao.UsuarioDao;
import com.gdaniel.login.model.Usuario;
import com.gdaniel.login.service.excptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	
	public List<Usuario> findAll(){
		return usuarioDao.findAll();
	}
	
	public Usuario findById(String id) {
		Optional<Usuario> usuario = usuarioDao.findById(id);
		return usuario.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
	
	
}
