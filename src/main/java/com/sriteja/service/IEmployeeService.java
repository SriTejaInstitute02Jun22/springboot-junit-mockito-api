package com.sriteja.service;

import java.util.List;

import com.sriteja.bean.Employee;

public interface IEmployeeService {

	public Employee save(Employee employee);

	public List<Employee> findAll();

}
