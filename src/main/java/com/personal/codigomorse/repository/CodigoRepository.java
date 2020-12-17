package com.personal.codigomorse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.codigomorse.modelo.Codigo;

public interface CodigoRepository extends JpaRepository<Codigo, Long>{
	
	Codigo findByMorse(String morse);
}
