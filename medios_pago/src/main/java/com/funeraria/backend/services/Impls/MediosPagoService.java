/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.funeraria.backend.services.Impls;

import com.funeraria.backend.models.MediosPago;
import com.funeraria.backend.repositories.MediosPagoRepository;
import com.funeraria.backend.services.IMediosPagoService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service

public class MediosPagoService implements IMediosPagoService{

    @Autowired
    private MediosPagoRepository mediosPagoRepository;
    @Override
    public List<MediosPago> findAll() {
        return (List) mediosPagoRepository.findAll();
    
    }

    @Override
    public Page<MediosPago> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional
    public MediosPago findById(Integer id) {
     return  mediosPagoRepository.findById(id).orElse(null);
    }

    @Override
    public MediosPago save(MediosPago mediosPago) {
        return mediosPagoRepository.save(mediosPago);
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
