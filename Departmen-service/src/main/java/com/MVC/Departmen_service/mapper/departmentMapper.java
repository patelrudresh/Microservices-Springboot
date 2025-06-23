package com.MVC.Departmen_service.mapper;

import com.MVC.Departmen_service.Dto.departmentDto;
import com.MVC.Departmen_service.entity.Department;

public class departmentMapper {
	 
	public static Department mapToDept(departmentDto dept) {
		Department dept1=new Department(
				dept.getId(),
				dept.getDeptName(),
				dept.getDeptDesc(),
				dept.getDeptCode());	
		return dept1;
	}
	public static departmentDto maptoDto(Department deptdto) {
		departmentDto deptdto1=new departmentDto(
				deptdto.getId(),
				deptdto.getDeptName(),
				deptdto.getDeptDesc(),
				deptdto.getDeptCode()
				);
		return deptdto1;
	}
	
}
