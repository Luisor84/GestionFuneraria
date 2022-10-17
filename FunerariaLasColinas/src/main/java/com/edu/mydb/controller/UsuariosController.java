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

import com.edu.mydb.model.service.UsuariosService;
import com.edu.mydb.modelo.entity.Usuarios;

@RestController
@RequestMapping("/api/usuarios")

public class UsuariosController {
	
@Autowired
UsuariosService usuariosService;


	@PostMapping
	public Usuarios save (@RequestBody Usuarios usuarios) {
		return usuariosService.save(usuarios);
	}
	
	@GetMapping("/listar")
	public Iterable<Usuarios>listarTodos(){
		return usuariosService.findAll();
	}
	@GetMapping("{id}")
	public Optional<Usuarios>buscarPorId(@PathVariable Integer id){
		return usuariosService.finById(id);
	}
	
	@DeleteMapping("{id}")
	public void Eliminar(@PathVariable Integer id){
		usuariosService.deleteById(id);
	}
	
	

}
