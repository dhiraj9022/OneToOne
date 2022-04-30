package com.dhiraj.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="email")
	private String email;
	
	//OnetoOne entity
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "emp_id", referencedColumnName = "id")
	
	//OnetoOne bidirectional entity
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName = "id")
	private Employee_Details employee_Details;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String fname, String lname, String email, Employee_Details employee_Details) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.employee_Details = employee_Details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee_Details getEmployee_Details() {
		return employee_Details;
	}

	public void setEmployee_Details(Employee_Details employee_Details) {
		this.employee_Details = employee_Details;
	}
	
	
}
