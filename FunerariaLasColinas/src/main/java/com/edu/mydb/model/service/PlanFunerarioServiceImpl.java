package com.edu.mydb.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.mydb.modelo.entity.PlanFunerario;
import com.edu.mydb.repository.PlanFunerarioRepository;

@Service
public class PlanFunerarioServiceImpl implements PlanFunerarioService{
	
	
	@Autowired
	private PlanFunerarioRepository planFunerarioRepository;
	
	

	@Override
	@Transactional(readOnly = true)
	public Iterable<PlanFunerario> findAll() {
		
		return planFunerarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<PlanFunerario> finById(Integer id) {
		
		return planFunerarioRepository.findById(id);
	}

	@Override
	@Transactional
	public PlanFunerario save(PlanFunerario p) {
		
		return planFunerarioRepository.save(p);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		
		planFunerarioRepository.deleteById(id);
		
	}

}
