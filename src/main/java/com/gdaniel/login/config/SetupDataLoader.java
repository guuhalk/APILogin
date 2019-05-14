package com.gdaniel.login.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import com.gdaniel.login.dao.UsuarioDao;
import com.gdaniel.login.model.Usuario;

@Configuration
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {


	    @Autowired
	    UsuarioDao usuarioDao;

	    @Override
	    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

	    	usuarioDao.deleteAll();
	        
	        Usuario joao = new Usuario("João", "Souza", "joao@gmail.com");
	        Usuario maria = new Usuario("Maria", "Teixeira", "maria@gmail.com");

	        createUserIfNotFound(joao);
	        createUserIfNotFound(maria);
	    }

	    private Usuario createUserIfNotFound(final Usuario user) {
	        Optional<Usuario> obj = usuarioDao.findByEmail(user.getEmail());
	        if(obj.isPresent()) {
	            return obj.get();
	        }
	        return usuarioDao.save(user);
	    }

	}
