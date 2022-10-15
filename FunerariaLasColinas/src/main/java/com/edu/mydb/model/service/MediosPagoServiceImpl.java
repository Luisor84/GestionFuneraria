package com.edu.mydb.model.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.mydb.modelo.entity.MediosPago;
import com.edu.mydb.repository.MediosPagoRepository;

@Service
public class MediosPagoServiceImpl implements MediosPagoService{

	@Autowired
	private MediosPagoRepository mediosPagoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<MediosPago> findAll() {
		// TODO Auto-generated method stub
		return mediosPagoRepository.findAll() ;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<MediosPago> findById(Integer id) {
		// TODO Auto-generated method stub
		return mediosPagoRepository.findById(id);
	}

	@Override
	@Transactional
	public MediosPago save(MediosPago m) {
		// TODO Auto-generated method stub
		return mediosPagoRepository.save(m);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
		mediosPagoRepository.deleteById(id);
		
	}

}
