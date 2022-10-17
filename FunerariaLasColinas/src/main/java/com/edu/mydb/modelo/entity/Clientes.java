package com.edu.mydb.modelo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblclientes")

public class Clientes {
	
	@Id
	@Column (name = "id_cliente")	
	private Integer idCliente;
	
	@Column (name = "identificacion")
	private String identificacion;
	
	@Column (name = "nombre_cliente")
	private String nombreCliente;
	
	@Column (name = "fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column (name = "direccion")
	private String direccion;
	
	@Column (name = "ciudad")
	private String ciudad;
	
	@Column (name = "telefono")
	private String telefono;
	
	@Column (name = "correo")
	private String correo;
	
	//@ManyToOne	
	//@JoinColumn (name = "id_planfunerario")
	//private Integer idPlanfunerario;
	
	//@ManyToOne
	//@JoinColumn (name = "id_usuario")
	//private Integer idUsuario;

public Clientes(Integer idCliente, String identificacion, String nombreCliente, Date fechaNacimiento, String direccion,
		String ciudad, String telefono, String correo, Integer idPlanfunerario, Integer idUsuario) {
	super();
	this.idCliente = idCliente;
	this.identificacion = identificacion;
	this.nombreCliente = nombreCliente;
	this.fechaNacimiento = fechaNacimiento;
	this.direccion = direccion;
	this.ciudad = ciudad;
	this.telefono = telefono;
	this.correo = correo;
	//this.idPlanfunerario = idPlanfunerario;
	//this.idUsuario = idUsuario;
}

public Clientes() {
	super();
}

public Integer getIdCliente() {
	return idCliente;
}

public void setIdCliente(Integer idCliente) {
	this.idCliente = idCliente;
}

public String getIdentificacion() {
	return identificacion;
}

public void setIdentificacion(String identificacion) {
	this.identificacion = identificacion;
}

public String getNombreCliente() {
	return nombreCliente;
}

public void setNombreCliente(String nombreCliente) {
	this.nombreCliente = nombreCliente;
}

public Date getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

//public Integer getIdPlanfunerario() {
	//return idPlanfunerario;
//}

//public void setIdPlanfunerario(Integer idPlanfunerario) {
	//this.idPlanfunerario = idPlanfunerario;
//}

//public Integer getIdUsuario() {
	//return idUsuario;
//}

//public void setIdUsuario(Integer idUsuario) {
	//this.idUsuario = idUsuario;
//}

@Override
public String toString() {
	return "Clientes [idCliente=" + idCliente + ", identificacion=" + identificacion + ", nombreCliente="
			+ nombreCliente + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", ciudad=" + ciudad
			+ ", telefono=" + telefono + ", correo=" + correo + "]";
}
	
	
	
	
	
	
	
}
	


