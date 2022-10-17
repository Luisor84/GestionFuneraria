package com.edu.mydb.model.service;

import java.util.Optional;

import com.edu.mydb.modelo.entity.Usuarios;


public interface UsuariosService {
	
	public Iterable <Usuarios> findAll();
	public Optional <Usuarios> finById(Integer id);
	public Usuarios save(Usuarios u);
	public void deleteById(Integer id);
}
