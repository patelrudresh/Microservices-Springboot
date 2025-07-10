package com.Organization_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Organization_service.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long>{
	Organization findByOrganizationCode(String organizationCode);

}
