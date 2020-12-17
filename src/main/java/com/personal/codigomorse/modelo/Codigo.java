package com.personal.codigomorse.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Codigo {
	
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;		
	private String morse;	
	private String traducao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMorse() {
		return morse;
	}
	public void setMorse(String morse) {
		this.morse = morse;
	}
	public String getTraducao() {
		return traducao;
	}
	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}
}
