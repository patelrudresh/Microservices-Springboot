package com.MVC.Employee_service.service;


import com.MVC.Employee_service.dto.APiResponseDto;
import com.MVC.Employee_service.dto.EmployeDto;

public interface employeService {
  public EmployeDto createEmployee(EmployeDto employeDto);
  public APiResponseDto getEmployeById(Long id);
}
