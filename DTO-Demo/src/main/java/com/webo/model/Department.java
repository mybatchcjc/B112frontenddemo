package com.webo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String deptname;
	
	
	public Department(int id, String deptname) {
//		super();
		this.id = id;
		this.deptname = deptname;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptname=" + deptname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	
	
}
