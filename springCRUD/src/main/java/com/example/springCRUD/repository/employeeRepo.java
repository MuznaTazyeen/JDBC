package com.example.springCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springCRUD.entity.Employee;

public interface employeeRepo extends JpaRepository<Employee, Integer> {
	

}
