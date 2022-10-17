package com.edu.mydb.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblplanfunerario")

public class PlanFunerario {
	
	@Id
	@Column (name = "id_planfunerario")	
	private Integer idPlanfunerario;
	
	@Column (name = "nombre_plan")	
	private String nombrePlan;
	
	@Column (name = "valor_plan")	
	private Double valorPlan;
	
	
	public PlanFunerario(Integer idPlanfunerario, String nombrePlan, Double valorPlan) {
		super();
		this.idPlanfunerario = idPlanfunerario;
		this.nombrePlan = nombrePlan;
		this.valorPlan = valorPlan;
	}
	public PlanFunerario() {
		super();
	}
	public Integer getIdPlanfunerario() {
		return idPlanfunerario;
	}
	public void setIdPlanfunerario(Integer idPlanfunerario) {
		this.idPlanfunerario = idPlanfunerario;
	}
	public String getNombrePlan() {
		return nombrePlan;
	}
	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}
	public Double getValorPlan() {
		return valorPlan;
	}
	public void setValorPlan(Double valorPlan) {
		this.valorPlan = valorPlan;
	}
	@Override
	public String toString() {
		return "PlanFunerario [idPlanfunerario=" + idPlanfunerario + ", nombrePlan=" + nombrePlan + ", valorPlan="
				+ valorPlan + "]";
	}
	
	

}
