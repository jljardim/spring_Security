package com.spring_security.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWord")
public class HelloWordRest {
	
	@GetMapping("/text")
	public String getHelloWord() {
		String hello = "Hello Word;";
	 return hello;	
	}
	
	@GetMapping("/pessoa")
	public Pessoa getPessoa(){
		Pessoa pessoa = new Pessoa("Jeferson", "33", "82", "1.71");
		pessoa.setIdade("35");
		return pessoa;
	}

}
