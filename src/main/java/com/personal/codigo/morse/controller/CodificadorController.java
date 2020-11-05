package com.personal.codigo.morse.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.codigo.morse.modelo.Codigo;
import com.personal.codigo.morse.modelo.Tradutor;
import com.personal.codigo.morse.repository.CodigoRepository;

@RestController
@RequestMapping("/morse")
public class CodificadorController {

	@Autowired CodigoRepository codigoRepository;
	
	
	@GetMapping
	public Tradutor decodificar(@RequestBody @Valid Codigo codigoCompleto){
		
		String mensagemMorse =  codigoCompleto.getMorse();
		String[] listaCodigos = mensagemMorse.split(" ");
		String codigoMorseCompleto = "";
		String mensagemCompleta = "";
		
		for(String codigo: listaCodigos) {
			System.out.println(codigo);
			codigoMorseCompleto += codigo;
			mensagemCompleta += codigoRepository.findByMorse(codigo).getTraducao();
			System.out.println(mensagemCompleta);
		}
		
		
		
		
		
		return new Tradutor(codigoMorseCompleto, mensagemCompleta);
	}
	
	
}
