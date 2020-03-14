package com.luis.springboot.backend.apirest.models.services;

import com.luis.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
