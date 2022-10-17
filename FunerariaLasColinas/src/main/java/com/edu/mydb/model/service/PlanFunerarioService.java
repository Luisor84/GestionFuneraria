package com.edu.mydb.model.service;

import java.util.Optional;

import com.edu.mydb.modelo.entity.PlanFunerario;

public interface PlanFunerarioService {
	
	public Iterable <PlanFunerario> findAll();
	public Optional <PlanFunerario> finById(Integer id);
	public PlanFunerario save(PlanFunerario p);
	public void deleteById(Integer id);

}
