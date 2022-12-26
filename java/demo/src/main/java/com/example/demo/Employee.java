package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer id;
	private String firstname;
	
	public Employee() {}

	public Employee(Integer id, String firstname) {
		super();
		this.id = id;
		this.firstname = firstname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + "]";
	}
	
	
}
