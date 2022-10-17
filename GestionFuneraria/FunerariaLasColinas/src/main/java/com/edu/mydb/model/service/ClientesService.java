package com.edu.mydb.model.service;

import java.util.Optional;

import com.edu.mydb.modelo.entity.Clientes;

public interface ClientesService {
	
	public Iterable <Clientes> findAll();
	public Optional <Clientes> finById(Integer id);
	public Clientes save(Clientes c);
	public void deleteById(Integer id);

}
