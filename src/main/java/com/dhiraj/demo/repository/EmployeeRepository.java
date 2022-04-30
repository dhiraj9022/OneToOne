package com.dhiraj.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.demo.entity.Employee;

@RestController
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	
}
