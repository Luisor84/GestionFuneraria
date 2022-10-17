package com.edu.mydb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.mydb.model.service.MediosPagoService;
import com.edu.mydb.modelo.entity.MediosPago;



@RestController
@RequestMapping("/api/mediosPago")
public class MediosPagoController {
	
@Autowired
private MediosPagoService mediosPagoService;
	
	@PostMapping
	public MediosPago guardar(@RequestBody MediosPago mediosPago ) {
		
		return mediosPagoService.save(mediosPago);
		
	}
	
	@GetMapping("/listar")
	public Iterable<MediosPago>ListarTodos(@PathVariable Integer id){
		
		return mediosPagoService.findAll();
		
	}
	
	@GetMapping("/id")
	public Optional<MediosPago>buscarPorId(@PathVariable Integer id){
		
		return mediosPagoService.findById(id);
	
	}
	
	@DeleteMapping("/id")
	public void eliminar(@PathVariable Integer id){
		
	mediosPagoService.deleteById(id);
	}

}
