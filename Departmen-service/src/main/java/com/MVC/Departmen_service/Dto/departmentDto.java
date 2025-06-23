package com.MVC.Departmen_service.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class departmentDto {
	private Long id;
	private String deptName;
	private String deptDesc;
	private String deptCode;
	

}
