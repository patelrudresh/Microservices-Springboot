package com.Organization_service.ServiceImpl;

import org.springframework.stereotype.Service;

import com.Organization_service.dto.OrganizationDto;
import com.Organization_service.entity.Organization;
import com.Organization_service.mapper.organizationMapper;
import com.Organization_service.repository.OrganizationRepository;
import com.Organization_service.service.OrganizationService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OrganizationServiceImpl implements OrganizationService {

	private OrganizationRepository organizationRepository;

	@Override
	public OrganizationDto createOrganization(OrganizationDto organizationDto) {

		// map to organization to organization jpa entity
		Organization organization = organizationMapper.maptoOrganization(organizationDto);
		Organization organizationdto = organizationRepository.save(organization);

		return organizationMapper.maptoOrgaizationDto(organizationdto);
	}

	@Override
	public OrganizationDto organizationFindById(String organizationCode) {
		Organization organization=  organizationRepository.findByOrganizationCode(organizationCode);
		return organizationMapper.maptoOrgaizationDto(organization);
	}

}
