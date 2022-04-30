package com.dhiraj.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiraj.demo.entity.Employee;
import com.dhiraj.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

@Autowired
	
	private EmployeeRepository employeeRepository;

	public Employee creatEmployees(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public void updateEmployees(Employee employee, int id)
	{
		Employee employees= new Employee();
		employees=employeeRepository.findById(id).get();
		employee.setFname(employees.getFname()); 
		employee.setLname(employees.getLname()); 
		employee.setEmail(employees.getEmail());
		employee.setEmployee_Details(employees.getEmployee_Details());
		employeeRepository.save(employee);
	
	}
	
	public List<Employee> getEmployees()
	{
		List<Employee> employees= new ArrayList<>();
			employeeRepository.findAll().forEach(emp -> employees.add(emp));
			return employees;
	}
	
	public void getById(int id)
	{
		 employeeRepository.findById(id);
	}
	
	public void delById( int id)
	{
		 employeeRepository.deleteById(id);
	}
	public void delAll()
	{
		employeeRepository.deleteAll();
	}
}
