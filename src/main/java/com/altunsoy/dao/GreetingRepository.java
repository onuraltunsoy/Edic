package com.altunsoy.dao;

import org.springframework.data.repository.CrudRepository;

import com.altunsoy.model.Greeting;

public interface GreetingRepository extends CrudRepository<Greeting,Long>{
	
}
