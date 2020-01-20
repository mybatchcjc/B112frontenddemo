package com.webo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empname;
	private String empaddress;
	private String empmobileno;
	private String empgender;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", empaddress=" + empaddress + ", empmobileno="
				+ empmobileno + ", empgender=" + empgender + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getEmpmobileno() {
		return empmobileno;
	}
	public void setEmpmobileno(String empmobileno) {
		this.empmobileno = empmobileno;
	}
	public String getEmpgender() {
		return empgender;
	}
	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}
	
}
