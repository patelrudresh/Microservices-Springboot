package com.Organization_service.service;

import com.Organization_service.dto.OrganizationDto;


public interface OrganizationService {
	public OrganizationDto createOrganization(OrganizationDto organizationDto);
	public  OrganizationDto organizationFindById(String organizationCode);

}
