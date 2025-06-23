package com.MVC.Departmen_service.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MVC.Departmen_service.Dto.departmentDto;
import com.MVC.Departmen_service.serviceImp.departmentServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/dept")
@AllArgsConstructor
public class DepartmentController {
	private departmentServiceImpl departmentService;
	
	@PostMapping
	public ResponseEntity<departmentDto>  Createdept(@RequestBody departmentDto dept) {
		departmentDto department= departmentService.saveDepartment(dept);
		return new ResponseEntity<>(department,HttpStatus.CREATED);
	}
	
	@GetMapping("{deptCode}")
	public ResponseEntity<departmentDto> getbydeparmentId (@PathVariable("deptCode")  String deptcode){
		  departmentDto getdept= departmentService.getDepartmentByCode(deptcode);
		  return new ResponseEntity<>(getdept,HttpStatus.OK);
		  
		  
		
	}


}
