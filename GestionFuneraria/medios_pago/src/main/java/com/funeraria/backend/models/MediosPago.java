/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funeraria.backend.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlo
 */
@Entity
@Table(name = "tblmediospago")


public class MediosPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_mediopago")
    private Integer idMediopago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mediopago")
    private String mediopago;

    public MediosPago() {
    }

    public MediosPago(Integer idMediopago) {
        this.idMediopago = idMediopago;
    }

    public MediosPago(Integer idMediopago, String mediopago) {
        this.idMediopago = idMediopago;
        this.mediopago = mediopago;
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
    public int hashCode() {
        int hash = 0;
        hash += (idMediopago != null ? idMediopago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MediosPago)) {
            return false;
        }
        MediosPago other = (MediosPago) object;
        if ((this.idMediopago == null && other.idMediopago != null) || (this.idMediopago != null && !this.idMediopago.equals(other.idMediopago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.funeraria.backend.models.MediosPago[ idMediopago=" + idMediopago + " ]";
    }
    
}
