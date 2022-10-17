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

import com.edu.mydb.model.service.PlanFunerarioService;
import com.edu.mydb.modelo.entity.PlanFunerario;

@RestController
@RequestMapping("/api/planFunerario")

public class PlanFunerarioController {
	
@Autowired

PlanFunerarioService planFunerarioService;

	@PostMapping
	public PlanFunerario save (@RequestBody PlanFunerario planFunerario) {
		return planFunerarioService.save(planFunerario);
	}

	@GetMapping("/listar")
	public Iterable<PlanFunerario>listarTodos(){
		return planFunerarioService.findAll();
		
	}
	
	@GetMapping("{id}")
	public Optional<PlanFunerario>buscarPorId(@PathVariable Integer id){
		return planFunerarioService.finById(id);
		
	}
	
	@DeleteMapping("{id}")
	public void Eliminar(@PathVariable Integer id){
		planFunerarioService.deleteById(id);
	
	
	}

}
