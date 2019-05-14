package com.gdaniel.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdaniel.login.dao.UsuarioDao;
import com.gdaniel.login.model.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	
	public List<Usuario> findAll(){
		return usuarioDao.findAll();
	}
	
	
	
	
}
