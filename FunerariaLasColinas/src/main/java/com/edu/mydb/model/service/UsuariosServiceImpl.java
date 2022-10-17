package com.edu.mydb.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.mydb.modelo.entity.Usuarios;
import com.edu.mydb.repository.UsuariosRepository;

@Service

public class UsuariosServiceImpl implements UsuariosService {
	
	@Autowired
	private UsuariosRepository usuariosRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuarios> findAll() {
		
		return usuariosRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuarios> finById(Integer id) {
		
		return usuariosRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuarios save(Usuarios u) {
		
		return usuariosRepository.save(u);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		
		usuariosRepository.deleteById(id);
		
	}

}
