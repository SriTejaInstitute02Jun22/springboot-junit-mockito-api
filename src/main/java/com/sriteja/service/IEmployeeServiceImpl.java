package com.sriteja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sriteja.bean.Employee;

@Service
public class IEmployeeServiceImpl implements IEmployeeService{

	@Override
	public Employee save(Employee employee) {
		
		Employee emp = new Employee();
		emp.setId(123);
		emp.setDept("IT");
		emp.setName("Ramesh");
		return emp;
	}

	@Override
	public List<Employee> findAll() {

		Employee emp1 = new Employee();
		emp1.setId(456);
		emp1.setDept("IT");
		emp1.setName("Janaki");
		
		Employee emp2 = new Employee();
		emp2.setId(565);
		emp2.setDept("Admin");
		emp2.setName("Manasa");
		
		Employee emp3 = new Employee();
		emp3.setId(123);
		emp3.setDept("IT");
		emp3.setName("Ramesh");
		
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		return listOfEmployee;
	}

}
