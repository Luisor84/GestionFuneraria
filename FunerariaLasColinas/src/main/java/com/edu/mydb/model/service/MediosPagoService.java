package com.edu.mydb.model.service;

import java.util.Optional;

import com.edu.mydb.modelo.entity.MediosPago;

public interface MediosPagoService {
	
	public Iterable<MediosPago>findAll();
	
	public Optional<MediosPago>findById(Integer id);
	
	public MediosPago save(MediosPago m);
	
	public void deleteById(Integer id);
	

}
