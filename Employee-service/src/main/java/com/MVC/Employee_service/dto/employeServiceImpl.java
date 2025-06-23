package com.MVC.Employee_service.dto;

import javax.management.JMRuntimeException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MVC.Employee_service.entity.Employee;
import com.MVC.Employee_service.mapper.employeMapper;
import com.MVC.Employee_service.repository.employeRepository;
import com.MVC.Employee_service.service.employeService;

@Service
public class employeServiceImpl implements employeService {
	
	@Autowired
	private employeRepository employerepository;

	@Override
	public EmployeDto createEmployee(EmployeDto employeDto) {
		   Employee employe=employeMapper.maptoDto(employeDto);
		   Employee saved=  employerepository.save(employe);
		return  employeMapper.Dtotomap(saved);
	}
	
	@Override
	public EmployeDto getEmployeById(Long id) {  
		
		  Employee savedemp=employerepository.findById(id).orElseThrow(()->new RuntimeException("employe does not "));
		  return employeMapper.Dtotomap(savedemp);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
