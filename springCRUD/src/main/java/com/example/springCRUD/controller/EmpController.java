package com.example.springCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springCRUD.entity.Employee;
import com.example.springCRUD.service.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeService eservice;
	
	@PostMapping("/addemp")
	public Employee addEmpployee(@RequestBody Employee emp) {
		return eservice.addEmp(emp);
	}
	
	//getting data
	@GetMapping("/getemp")
	public List<Employee> getEmployee() {
		return eservice.getEmp();
	}
	
	
	//update
	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return eservice.updateEmp(emp);
	}
	
	//delete mapping
	@DeleteMapping("/deleteemp/{id}")
	public void deleteMapping(@PathVariable Integer id) {
		eservice.deleteEmp(id);
	
	}

}
