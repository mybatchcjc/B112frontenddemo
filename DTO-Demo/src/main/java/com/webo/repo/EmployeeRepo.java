package com.webo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webo.model.Employee;

@Repository
public interface EmployeeRepo  extends CrudRepository<Employee, Integer>{

}
