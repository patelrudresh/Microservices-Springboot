package com.MVC.Departmen_service.service;

import com.MVC.Departmen_service.Dto.departmentDto;

public interface departmentService {
	public departmentDto saveDepartment(departmentDto departmentDto);
	public departmentDto getDepartmentByCode(String departmentcode);
}
