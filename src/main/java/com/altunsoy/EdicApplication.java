package com.altunsoy;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.altunsoy.dao.GreetingRepository;
import com.altunsoy.model.Greeting;


@SpringBootApplication
public class EdicApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdicApplication.class, args);
	}
	@Bean 
	ApplicationRunner applicaitonrunner(GreetingRepository greetingRepository) {
		
		return args->{
			///greetingRepository.save(new Greeting("hello"));
			
			///greetingRepository.save(new Greeting("hi"));
		};
		
	}

}
