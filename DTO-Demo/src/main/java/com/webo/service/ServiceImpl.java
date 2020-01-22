package com.webo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import com.webo.model.Employee;
import com.webo.model.EmployeeDTO;
import com.webo.model.EmployeeDTO1;
import com.webo.repo.EmployeeRepo;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	EmployeeRepo er;

	public List<Employee> findAll() {
		return (List<Employee>) er.findAll();
	}

	@Override
	public void save(Employee e) {
		er.save(e);

	}

	@Override
	public List<EmployeeDTO> getempdto() {
		// TODO Auto-generated method stub
		return er.fetchdata();
	}

//	@Override
//	public List<EmployeeDTO> getempdto() {
//		// TODO Auto-generated method stub
//		List<Employee> emplist = (List<Employee>) er.findAll();
//		List<EmployeeDTO> empdtolist = new ArrayList<EmployeeDTO>();
//		ModelMapper m = new ModelMapper();
//		for (Employee employee : emplist) {
//			EmployeeDTO e = m.map(employee, EmployeeDTO.class);
//			empdtolist.add(e);
//		}
//
//		return empdtolist;
//	}
//
//	@Override
//	public void save1(EmployeeDTO e) {
//		// TODO Auto-generated method stub
//		ModelMapper m = new ModelMapper();
//		Employee emp = m.map(e, Employee.class);
//		er.save(emp);
//	}
//
//	@Override
//	public void saveDto(EmployeeDTO1 e) {
//		// TODO Auto-generated method stub
//		System.out.println(e);
////		ModelMapper m=new ModelMapper();
////		m.addMappings(new PropertyMap<EmployeeDTO1, Employee>() {
////		@Override
////		protected void configure() {
////			// TODO Auto-generated method stub
////		map().setEmpname(e.getEmpname());
////		map().setEmpaddress(e.getAddress());
////		}
////		});
////		Employee emp=m.map(e, Employee.class);
////		System.out.println(e);
////		System.out.println(emp);
//		Employee emp=new Employee();
//		emp.setEmpname(e.getEmpname());
//		emp.setEmpaddress(e.getAddress());
//		er.save(emp);
//	}
//
//	@Override
//	public Employee getemployee(String name) {
//		// TODO Auto-generated method stub
//		Employee e=er.findByEmpname(name);
//		ModelMapper m=new ModelMapper();
////		EmployeeDTO edto=
////		return m.map(e, EmployeeDTO.class);
//		return er.findByEmpname(name);
//	}
//	
	
}
