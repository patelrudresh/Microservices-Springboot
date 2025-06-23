package com.MVC.Employee_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class EmployeDto {
	private Long id;
	private String firstName;
	private String lastName;
	private String employeEmail;
}
