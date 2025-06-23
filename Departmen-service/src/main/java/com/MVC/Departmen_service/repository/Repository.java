package com.MVC.Departmen_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.MVC.Departmen_service.entity.Department;

public interface Repository extends JpaRepository<Department, Long>{
	
	 Department findByDeptCode(String deptCode);

}
