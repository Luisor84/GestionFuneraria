/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.funeraria.backend.services;

import com.funeraria.backend.models.MediosPago;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author carlo
 */
public interface IMediosPagoService {
     public List<MediosPago> findAll();

    public Page<MediosPago> findAll(Pageable pageable);

    public MediosPago findById(Integer id);

    public MediosPago save(MediosPago mediosPago);

    public void delete(Long id);
}
