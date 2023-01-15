package com.sriteja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="EMPLOYEE_DETAILS")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMP_ID")
	private int id;
	
	@Column(name = "EMP_NAME")
	private String name;
	
	@Column(name = "EMP_DEPT")
	private String department;
	
	@Column(name = "EMP_SALARY")
	private String salary;
}