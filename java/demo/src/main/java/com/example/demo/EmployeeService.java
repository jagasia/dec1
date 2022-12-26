package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee e=null;
		if(temp.isPresent())
		{
			e=temp.get();
		}
		return e;
	}
	public Employee update(Employee employee) {
		Optional<Employee> temp = er.findById(employee.getId());
		Employee e=null;
		if(temp.isPresent())
		{
			er.save(employee);
		}
		return e;
	}
	
	public Employee delete(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee e=null;
		if(temp.isPresent())
		{
			e=temp.get();
			er.delete(e);
		}
		return e;
	}
	

}
