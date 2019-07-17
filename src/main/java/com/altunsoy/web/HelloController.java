package com.altunsoy.web;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altunsoy.dao.GreetingRepository;
import com.altunsoy.model.Greeting;
import com.apple.eawt.Application;

@RestController
public class HelloController {
	private  final GreetingRepository greetingRepository;

	public HelloController(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String gets() {
		return "Hello";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/greetings")
	Iterable<Greeting> greetings(){
		
		return greetingRepository.findAll();
	}
	
}
