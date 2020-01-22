package com.webo.model;

public class EmployeeDTO1 {
	
	public EmployeeDTO1(String empname, String address) {
		this.empname = empname;
		this.address = address;
	}

	private String empname;
	private String address;
	
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "EmployeeDTO1 [empname=" + empname + ", address=" + address + "]";
	}
}
