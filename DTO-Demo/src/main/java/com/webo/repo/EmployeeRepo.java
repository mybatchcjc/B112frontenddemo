package com.webo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webo.model.Employee;
import com.webo.model.EmployeeDTO;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query("Select new com.webo.model.EmployeeDTO(e.empname,e.empaddress,d.deptname) from Employee e INNER JOIN e.deptname d")
	public List<EmployeeDTO> fetchdata();

	public Employee findByEmpname(String empname);
}
