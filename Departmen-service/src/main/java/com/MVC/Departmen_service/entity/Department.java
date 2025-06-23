package com.MVC.Departmen_service.entity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")

@Entity
public class Department {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="DEPARTMENT_NAME")
	private String deptName;
	@Column(name="DEPARTMENT_DESCRIPTION")
	private String deptDesc;
	@Column(name="DEPARTMENT_CODE",unique = true,nullable = true)
	private String deptCode;
}
