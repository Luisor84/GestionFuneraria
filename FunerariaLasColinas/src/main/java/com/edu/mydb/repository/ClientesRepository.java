package com.edu.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.mydb.modelo.entity.Clientes;

@Repository

public interface ClientesRepository extends JpaRepository <Clientes, Integer>{

}
