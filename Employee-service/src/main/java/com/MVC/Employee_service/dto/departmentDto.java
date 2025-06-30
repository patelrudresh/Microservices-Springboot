package com.MVC.Employee_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
	public class departmentDto {
		private Long id;
		private String deptName;
		private String deptDesc;
		private String deptCode;
}
