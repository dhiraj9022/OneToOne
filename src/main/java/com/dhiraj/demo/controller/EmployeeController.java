package com.dhiraj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.demo.entity.Employee;
import com.dhiraj.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		
	  return 	employeeService.creatEmployees(employee);
	}
	@GetMapping("/employees")
	public List<Employee> getEmployees(@RequestBody Employee employee)
	{
		return employeeService.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public void getByIdEmployees(@PathVariable int id)
	{
		 employeeService.getById(id);
	}
	
	@DeleteMapping("/employees/del/{id}")
	public void delByIdEmployees(@PathVariable int id)
	{
		 employeeService.delById(id);
	}
	
	@DeleteMapping("/employees")
	public void delAllEmployees()
	{
		employeeService.delAll();
	}
	
	@PutMapping("/employees/update/{id}")
	public void updateEmployees(@RequestBody Employee employee, @PathVariable int id)
	{
		employeeService.updateEmployees(employee, id);
	}
	
	
}
