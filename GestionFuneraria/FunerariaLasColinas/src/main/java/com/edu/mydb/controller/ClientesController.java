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

import com.edu.mydb.model.service.ClientesService;
import com.edu.mydb.modelo.entity.Clientes;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {
	
@Autowired
ClientesService clientesService;
	
	@PostMapping
	public Clientes save (@RequestBody Clientes clientes) {
		
		return clientesService.save(clientes);
	}
	
	
	@GetMapping("/listar")
	public Iterable<Clientes>listarTodos(@RequestBody Clientes clientes){
		
		return clientesService.findAll();
		
	}
	
	@GetMapping("{id}")
	public Optional<Clientes>buscarPorId(@PathVariable Integer id){
		
		return clientesService.finById(id);
		
	}
	
	@DeleteMapping("{id}")
	public void Eliminar(@PathVariable Integer id){
		
		clientesService.deleteById(id);
		
	}
	

}
