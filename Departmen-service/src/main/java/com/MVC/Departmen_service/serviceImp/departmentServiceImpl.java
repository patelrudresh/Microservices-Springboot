package com.MVC.Departmen_service.serviceImp;

import org.springframework.stereotype.Service;

import com.MVC.Departmen_service.Dto.departmentDto;
import com.MVC.Departmen_service.entity.Department;
import com.MVC.Departmen_service.mapper.departmentMapper;
import com.MVC.Departmen_service.repository.Repository;
import com.MVC.Departmen_service.service.departmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class departmentServiceImpl implements departmentService {
	
	private Repository repository;

	@Override
	public departmentDto saveDepartment(departmentDto departmentDto) {
		
		Department dept=departmentMapper.mapToDept(departmentDto);
		Department saved=repository.save(dept);
		return departmentMapper.maptoDto(saved);
	}
	
	@Override
	public departmentDto getDepartmentByCode(String deptCode) {
		
         Department saved1=repository.findByDeptCode(deptCode);
		 return departmentMapper.maptoDto(saved1);
		
	}
	
}
