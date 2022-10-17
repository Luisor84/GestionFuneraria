package com.edu.mydb.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblmediospago")
public class MediosPago {
	@Id
	@Column(name = "id_mediopago")
	private Integer idMediopago;
	
	@Column(name = "mediopago")
    private String mediopago;

	public MediosPago(Integer idMediopago, String mediopago) {
		
		this.idMediopago = idMediopago;
		this.mediopago = mediopago;
	}

	public MediosPago() {
		super();
	}

	public Integer getIdMediopago() {
		return idMediopago;
	}

	public void setIdMediopago(Integer idMediopago) {
		this.idMediopago = idMediopago;
	}

	public String getMediopago() {
		return mediopago;
	}

	public void setMediopago(String mediopago) {
		this.mediopago = mediopago;
	}

	@Override
	public String toString() {
		return "MediosPago [idMediopago=" + idMediopago + ", mediopago=" + mediopago + "]";
	}
	
    
    
}
