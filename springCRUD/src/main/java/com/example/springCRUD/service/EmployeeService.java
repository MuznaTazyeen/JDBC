package com.example.springCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springCRUD.entity.Employee;
import com.example.springCRUD.repository.employeeRepo;

@Service
public class EmployeeService {
	
	//postman --> controller(URL pattern) --> service --> repository(autoquerying) --> DB
	
	@Autowired
	private employeeRepo erepo;
	
	//adding employee details
	public Employee addEmp(Employee emp) {
		return erepo.save(emp);
		
	}
	
	//read employee details
	public List <Employee> getEmp() {
		return erepo.findAll();
	}
	
	//update employee
	public Employee updateEmp (Employee emp) {
		Integer empID = emp.getEmpID();
		Employee emp1 = erepo.findById(empID).get();
		//emp -> current value/already existing 
		//emp1 -> updated data
		
		emp1.setEmpName(emp.getEmpName());
		emp1.setDept(emp.getDept());
		return erepo.save(emp1);
	}
	
	//delete employee
	public void deleteEmp(Integer id) {
		erepo.deleteById(id);
		
	}
	

}
