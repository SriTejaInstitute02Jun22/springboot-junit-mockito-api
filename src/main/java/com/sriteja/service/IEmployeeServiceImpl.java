package com.sriteja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriteja.model.Employee;
import com.sriteja.repository.EmployeeRepository;



@Service
public class IEmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	
	}

	@Override
	public List<Employee> findAll() {

		Employee emp1 = new Employee();
		emp1.setId(456);
		emp1.setDepartment("IT");
		emp1.setName("Janaki");
		
		Employee emp2 = new Employee();
		emp2.setId(565);
		emp2.setDepartment("Admin");
		emp2.setName("Manasa");
		
		Employee emp3 = new Employee();
		emp3.setId(123);
		emp3.setDepartment("IT");
		emp3.setName("Ramesh");
		
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		return listOfEmployee;
	}
	
	

}
