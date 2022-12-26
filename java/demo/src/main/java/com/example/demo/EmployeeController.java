package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = {"localhost:*"})
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	@PostMapping
	public void create(@RequestBody Employee employee) {}
	
	@GetMapping
	public List<Employee> read() {
		return es.read();
	}
	
	@GetMapping("/{id}")
	public Employee read(@PathVariable("id")Integer id) {
		return es.read(id);
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		return es.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable("id") Integer id) {
		return es.delete(id);
	}
	

}
