package br.com.fiap.loja.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ola")
public class DigaOla {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String digaOla(){
		return "Olá";
	}

}
