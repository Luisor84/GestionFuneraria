/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.funeraria.backend.repositories;

import com.funeraria.backend.models.MediosPago;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carlo
 */
public interface MediosPagoRepository extends JpaRepository<MediosPago, Integer> {
    
}
