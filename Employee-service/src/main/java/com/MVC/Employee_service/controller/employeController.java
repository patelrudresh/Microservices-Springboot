package com.MVC.Employee_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MVC.Employee_service.dto.APiResponseDto;
import com.MVC.Employee_service.dto.EmployeDto;

import com.MVC.Employee_service.serviceImpl.employeServiceImpl;

@RestController
@RequestMapping("api/employe")
public class employeController {
	
	@Autowired
	private employeServiceImpl employeeservice;
	
	@PostMapping
	public ResponseEntity<EmployeDto>  savedEmploye(@RequestBody EmployeDto empdto) {
  return new ResponseEntity<>(employeeservice.createEmployee(empdto),HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<APiResponseDto> getEmployeById(@PathVariable("id") Long empid){
		APiResponseDto foundemp= employeeservice.getEmployeById(empid);
		return new ResponseEntity<>(foundemp,HttpStatus.CREATED);
	}
	
}
