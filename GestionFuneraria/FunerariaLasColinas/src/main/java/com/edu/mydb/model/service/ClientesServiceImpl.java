package com.edu.mydb.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.mydb.modelo.entity.Clientes;
import com.edu.mydb.repository.ClientesRepository;

@Service

public class ClientesServiceImpl implements ClientesService {
	
	@Autowired
	private ClientesRepository clientesRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Clientes> findAll() {
		
		return clientesRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Clientes> finById(Integer id) {
		
		return clientesRepository.findById(id);
	}

	@Override
	@Transactional
	public Clientes save(Clientes c) {
		
		return clientesRepository.save(c);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		
		clientesRepository.deleteById(id);
		
	}

}
