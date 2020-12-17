package com.personal.codigomorse.modelo;


public class Tradutor {
	
	
	private String morseCompleto;
	private String mensagemCompleta;
	
	public Tradutor(String morseCompleto, String mensagemCompleta) {
		this.morseCompleto =  morseCompleto;
		this.mensagemCompleta = mensagemCompleta;
	}

	public String getMorseCompleto() {
		return morseCompleto;
	}

	public String getMensagemCompleta() {
		return mensagemCompleta;
	}

	public String toString() {
		return this.mensagemCompleta;
	}
	
	
}
