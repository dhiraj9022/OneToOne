package com.dhiraj.demo.entity;

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
@Table(name="empdetails")
public class Employee_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "address")
	private String address;

	@Column(name="dept")
	private String dept;
	
	@Column(name="jobtitle")
	private String jobtitle;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employee_Details")
	@JoinColumn(name = "emp_id",referencedColumnName = "id")
	private Employee employee;
	
	public Employee_Details()
	{
		
	}

	public Employee_Details(int id, String address, String dept, String jobtitle, Employee employee) {
		super();
		this.id=id;
		this.address = address;
		this.dept = dept;
		this.jobtitle = jobtitle;
		this.employee = employee;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	
	
	//OnetoOne Unidirectional
	/*public Employee_Details()
	{
		
	}

	public Employee_Details(int id, String address, String dept, String jobtitle) {
		super();
		this.id = id;
		this.address = address;
		this.dept = dept;
		this.jobtitle = jobtitle;
	}
	
	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
*/
	
}
