package com.personal.codigo.morse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.codigo.morse.modelo.Codigo;

public interface CodigoRepository extends JpaRepository<Codigo, Long>{
	
	Codigo findByMorse(String morse);
}
