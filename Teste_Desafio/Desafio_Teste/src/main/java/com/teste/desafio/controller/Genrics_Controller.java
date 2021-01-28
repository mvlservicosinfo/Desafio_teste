package com.teste.desafio.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.desafio.pessoa.Pessoa;

@RestController
public class Genrics_Controller {
	
	
	@GetMapping
	public List<Pessoa>cad_Pessoa() {
		
		var p1 = new Pessoa();
		p1.setNome("Marcelo");
		p1.setEndereco("Rua José Verissimo");
		p1.setNumero(57);
		p1.setBairro("Alto da Mooca");
				
		return Arrays.asList(p1);
	}
	
	

}
