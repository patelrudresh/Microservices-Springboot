package com.Organization_service.mapper;

import com.Organization_service.dto.OrganizationDto;
import com.Organization_service.entity.Organization;

public class organizationMapper {

	public static OrganizationDto maptoOrgaizationDto(Organization organization) {
		OrganizationDto organizationDto = new OrganizationDto(organization.getId(), organization.getOrganizationName(),
				organization.getOrganizationDescription(), organization.getOrganizationCode(),
				organization.getCreateDate());
		return organizationDto;
	}	

	public static Organization maptoOrganization(OrganizationDto organizationDto) {
		Organization organization = new Organization(organizationDto.getId(), organizationDto.getOrganizationName(),
				organizationDto.getOrganizationDescription(), organizationDto.getOrganizationCode(),
				organizationDto.getCreateDate());
		return organization;
	}

}

