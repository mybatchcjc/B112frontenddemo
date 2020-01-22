package com.webo.model;

public class EmployeeDTO {
	private String empname;
	private String empaddress;
	private String deptname;
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
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
//	public EmployeeDTO(String empname, String empaddress, String deptname) {
////		super();
//		this.empname = empname;
//		this.empaddress = empaddress;
//		this.deptname = deptname;
//	}
	public EmployeeDTO(String empname, String empaddress, String deptname) {
		this.empname = empname;
		this.empaddress = empaddress;
		this.deptname = deptname;
	}
	
	
		
}

