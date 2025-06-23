package com.MVC.Employee_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MVC.Employee_service.entity.Employee;

public interface employeRepository extends JpaRepository<Employee, Long> {
	
	

}
