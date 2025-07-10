package com.Organization_service.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="organizations")
public class Organization {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "ORGANIZATIONNAME",nullable = false)
	    private String organizationName;

	    @Column(name = "ORGANIZATIONDESCRIPTION")
	    private String organizationDescription;

	    @Column(name = "ORAGANIZATIONCODE",unique = true,nullable = false) // Yes, this is a spelling mistake in DB, so must match exactly
	    private String organizationCode;

	    @CreationTimestamp
	    private LocalDateTime createDate;

	    // getters and setters...
	

}
