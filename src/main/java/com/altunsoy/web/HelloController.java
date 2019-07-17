package com.altunsoy.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altunsoy.dao.GreetingRepository;
import com.altunsoy.model.Greeting;


@RestController
public class HelloController {
	private  final GreetingRepository greetingRepository;

	public HelloController(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello3")
	public String gets() {
		return "Hello";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/greetings")
	Iterable<Greeting> greetings(){
		
		return greetingRepository.findAll();
	}
	@RequestMapping(method = RequestMethod.POST, value = "/greetings")
	public ResponseEntity<?> greetings(@RequestBody Greeting greeting){
		
		
		try {
			greetingRepository.save(greeting);
			
			return ResponseEntity.ok(greeting);
		} catch (Exception ex) {
			return ResponseEntity.notFound().build();
		}
		 
	}
	
}
