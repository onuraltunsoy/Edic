package com.altunsoy.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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
	
	public Greeting() {
		
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
