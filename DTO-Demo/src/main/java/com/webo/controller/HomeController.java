package com.webo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webo.exception.EmployeeNotFoundException;
import com.webo.model.Employee;
import com.webo.model.EmployeeDTO;
import com.webo.model.EmployeeDTO1;
import com.webo.service.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI s;

	@RequestMapping("/get")
	public List<Employee> getAllemp() {
		return s.findAll();
	}
	@RequestMapping("/getemployees")
	public List<EmployeeDTO> getemployees(){
		return s.getempdto();
	}

	@RequestMapping("/save")
	public String save(@RequestBody Employee e) {
		System.out.println("hiii home");
		s.save(e);
		return "success";
	}
	/*
	 * @RequestMapping("/getbydto") public List<EmployeeDTO> getdtoemp(){
	 * System.out.println("hi home dto");
	 * 
	 * List<EmployeeDTO> e=new ArrayList<EmployeeDTO>(); List<Employee> emplist
	 * =s.findAll(); for (Employee employee : emplist) { EmployeeDTO edto=new
	 * EmployeeDTO(); edto.setEmpname(employee.getEmpname());
	 * edto.setEmpaddress(employee.getEmpaddress()); e.add(edto); }
	 * 
	 * return s.getempdto(); }
	 * 
	 * @RequestMapping("/savedto") public String saaveDto(@RequestBody EmployeeDTO1
	 * e) { System.out.println("employee DTO1"); // System.out.println(e);
	 * s.saveDto(e); return "save dto successfully"; }
	 * 
	 * @RequestMapping(value = "/getname/{empname}") public Employee
	 * getbyname(@PathVariable("empname") String name) throws
	 * EmployeeNotFoundException { Employee empd=s.getemployee(name);
	 * System.out.println(empd); if(empd!=null) { return empd; }else { throw new
	 * EmployeeNotFoundException("employee is not found"); }
	 * 
	 * }
	 */
}
