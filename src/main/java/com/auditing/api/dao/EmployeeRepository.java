package com.auditing.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auditing.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
