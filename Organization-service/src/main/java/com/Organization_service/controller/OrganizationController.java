package com.Organization_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Organization_service.ServiceImpl.OrganizationServiceImpl;
import com.Organization_service.dto.OrganizationDto;
import com.Organization_service.repository.OrganizationRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/organization")
public class OrganizationController {
   private OrganizationServiceImpl organizationServiceImpl;
   
   @PostMapping
   public  ResponseEntity<OrganizationDto> createOrganization(@RequestBody OrganizationDto organizationDto) {
	 OrganizationDto organization=  organizationServiceImpl.createOrganization(organizationDto);
	 return new ResponseEntity<>(organization,HttpStatus.CREATED);
   }
   
   @GetMapping("{code}")
  public ResponseEntity<OrganizationDto> findbyId(@PathVariable("code") String organizationCode){
	   OrganizationDto matched=organizationServiceImpl.organizationFindById(organizationCode);
	   return ResponseEntity.ok(matched);
   }
} 