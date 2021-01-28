package com.teste.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.teste.desafio.controller.Genrics_Controller;

@SpringBootApplication
public class DesafioTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioTesteApplication.class, args);
		
		var g1 = new Genrics_Controller();
		
		
	}

}
