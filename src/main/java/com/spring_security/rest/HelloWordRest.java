package com.spring_security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWord")
public class HelloWordRest {
	
	@GetMapping
	public String getHelloWord() {
		String hello = "Hello Word";
	 return hello;	
	}

}
