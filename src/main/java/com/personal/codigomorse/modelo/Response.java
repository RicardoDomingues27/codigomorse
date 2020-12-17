package com.personal.codigomorse.modelo;

import java.util.ArrayList;
import java.util.List;

public class Response {

	private final List<Tradutor> response;
	
	public Response(Tradutor response) {
		this.response = new ArrayList<>();
		this.response.add(response);
	}
	public List<Tradutor> getResponse() {
		return response;
	}
	
}
