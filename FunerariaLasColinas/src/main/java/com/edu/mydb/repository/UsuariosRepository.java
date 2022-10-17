package com.edu.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.mydb.modelo.entity.Usuarios;


@Repository
public interface UsuariosRepository extends JpaRepository <Usuarios, Integer> {

}
