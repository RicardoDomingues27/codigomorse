package com.personal.codigomorse.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.codigomorse.modelo.Codigo;
import com.personal.codigomorse.modelo.Response;
import com.personal.codigomorse.modelo.Tradutor;
import com.personal.codigomorse.repository.CodigoRepository;

@RestController
@RequestMapping("/v1/morse2text")
public class CodificadorController {

	@Autowired CodigoRepository codigoRepository;	
	
	@GetMapping
	public Response decodificar(@RequestBody @Valid Codigo codigoCompleto){
		
		String mensagemMorse =  codigoCompleto.getMorse();
		String[] listaCodigos = mensagemMorse.split(" ");
		StringBuilder codigoMorseCompleto = new StringBuilder();
		StringBuilder mensagemCompleta = new StringBuilder();
		
		for(String codigo: listaCodigos) {
			
			codigoMorseCompleto.append(codigo);
			mensagemCompleta.append(codigoRepository.findByMorse(codigo) !=null  ? codigoRepository.findByMorse(codigo).getTraducao() : "" );			
		}
		
		return new Response(new Tradutor(codigoMorseCompleto.toString(), mensagemCompleta.toString()));
	}
	
	
}
