package com.gdaniel.login.dto;

import java.io.Serializable;

import com.gdaniel.login.model.Usuario;

public class UsuarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;
    private String firstName;
    private String lastName;
    private String email;
	
    public UsuarioDTO() {
    	
    }
    
    public UsuarioDTO(Usuario usu) {
    	this.setId(usu.getId());
    	this.setFirstName(usu.getFirstName());
    	this.setLastName(usu.getEmail());
    	this.setEmail(usu.getEmail());
    			
    }

    
    
    // GATTERS AND SETTERS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
