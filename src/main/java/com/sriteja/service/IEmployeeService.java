package com.sriteja.service;

import java.util.List;

import com.sriteja.model.Employee;


public interface IEmployeeService {

	public void save(Employee employee);

	public List<Employee> findAll();

}
