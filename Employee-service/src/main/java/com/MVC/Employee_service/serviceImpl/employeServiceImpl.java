package com.MVC.Employee_service.serviceImpl;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.MVC.Employee_service.dto.APiResponseDto;
//import com.MVC.Employee_service.dto.DepartmentDto;
import com.MVC.Employee_service.dto.EmployeDto;
import com.MVC.Employee_service.dto.departmentDto;
import com.MVC.Employee_service.entity.Employee;
import com.MVC.Employee_service.mapper.employeMapper;
import com.MVC.Employee_service.repository.employeRepository;
import com.MVC.Employee_service.service.APIClient;
import com.MVC.Employee_service.service.employeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class employeServiceImpl implements employeService {

	@Autowired
	private employeRepository employeRepository;
//    @Autowired
//    private RestTemplate resttemplate;

//	@Autowired
//	private WebClient webclient;
	
	private APIClient apiClient;

	@Override
	public EmployeDto createEmployee(EmployeDto employeDto) {
		Employee employee = employeMapper.maptoDto(employeDto);
		Employee savedEmployee = employeRepository.save(employee);
		return employeMapper.Dtotomap(savedEmployee);
	}

	@Override
	public APiResponseDto getEmployeById(Long id) {
		Employee emp = employeRepository.findById(id). orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
//    	ResponseEntity<departmentDto> responseEntity =resttemplate.getForEntity("http://localhost:8080/api/dept/"+emp.getDeptCode(), departmentDto.class);
// 	 departmentDto departmentDto=responseEntity.getBody();
		EmployeDto employeDto= employeMapper.Dtotomap(emp);
//		departmentDto departmentDto =webclient.get().uri("http://localhost:8080/api/dept/"+emp.getDeptCode()).retrieve().bodyToMono(departmentDto.class).block();
		departmentDto departmentDto =apiClient.getbydeparmentId(emp.getDeptCode());
		APiResponseDto apiresponsedto = new APiResponseDto();
		apiresponsedto.setEmployeDto(employeDto);
		apiresponsedto.setDepartmentDto(departmentDto);
		return apiresponsedto;

	}

}
