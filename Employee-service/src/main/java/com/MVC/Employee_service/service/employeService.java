package com.MVC.Employee_service.service;

import com.MVC.Employee_service.dto.EmployeDto;

public interface employeService {
  public EmployeDto createEmployee(EmployeDto employeDto);
  public EmployeDto getEmployeById(Long id);
}
