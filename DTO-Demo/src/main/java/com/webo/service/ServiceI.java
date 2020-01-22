package com.webo.service;

import java.util.List;

import com.webo.model.Employee;
import com.webo.model.EmployeeDTO;
import com.webo.model.EmployeeDTO1;

public interface ServiceI {
	public List<Employee> findAll();
	public void save(Employee e);
	public List<EmployeeDTO> getempdto();
//	public void save1(EmployeeDTO e);
//	public void saveDto(EmployeeDTO1 e);
//	public Employee getemployee(String name);
}
