package com.MVC.Employee_service.mapper;

import com.MVC.Employee_service.dto.EmployeDto;
import com.MVC.Employee_service.entity.Employee;

public class employeMapper {

	public static Employee maptoDto(EmployeDto empdto) {
		Employee emp = new Employee(empdto.getId(), empdto.getFirstName(), empdto.getLastName(),
				empdto.getEmployeEmail(),empdto.getDeptCode()

		);
		return emp;
	}

	public static EmployeDto Dtotomap(Employee employe) {
		EmployeDto empdto = new EmployeDto(employe.getId(), employe.getFirstName(), employe.getLastName(),
				employe.getEmployeEmail() ,employe.getDeptCode());
		return empdto;

	}

}
