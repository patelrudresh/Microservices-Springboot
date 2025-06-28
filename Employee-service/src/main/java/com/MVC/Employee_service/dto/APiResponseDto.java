package com.MVC.Employee_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class APiResponseDto {
	public EmployeDto employeDto;
	public departmentDto departmentDto;

}
