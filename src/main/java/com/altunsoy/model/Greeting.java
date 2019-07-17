package com.altunsoy.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Greeting{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String message;
	
	public Greeting( String message) {
		super();
		this.message = message;
	}
	
	

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
