package com.MVC.Employee_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.MVC.Employee_service.dto.departmentDto;

@FeignClient(url = "http://localhost:8080/", value = "Department-service")
public interface APIClient {
	@GetMapping("api/dept/{deptCode}")
	departmentDto getbydeparmentId(@PathVariable("deptCode") String deptcode);

}
