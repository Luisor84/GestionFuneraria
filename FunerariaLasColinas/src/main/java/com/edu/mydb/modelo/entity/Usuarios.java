package com.edu.mydb.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblusuarios")

public class Usuarios {
	
	@Id
	@Column (name = "id_usuario")	
	private Integer idUsuario;
	
	@Column (name = "usuario")
	private String Usuario;
	
	@Column (name = "contraseña")
	private String Contraseña;
	
	@Column (name = "nombres")
	private String nombres;
	
	
	public Usuarios(Integer idUsuario, String usuario, String contraseña, String nombres) {
		super();
		this.idUsuario = idUsuario;
		Usuario = usuario;
		Contraseña = contraseña;
		this.nombres = nombres;
	}
	public Usuarios() {
		super();
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", Usuario=" + Usuario + ", Contraseña=" + Contraseña + ", nombres="
				+ nombres + "]";
	}
	
	

}
