package com.sriteja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sriteja.bean.Employee;
import com.sriteja.bean.Response;
import com.sriteja.service.IEmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;

	@PostMapping("/addEmployee")
	public Response addEmployee(@RequestBody Employee employee) {
		System.out.println("============================");
		employeeService.save(employee);
		return new Response(employee.getId() + " inserted", Boolean.TRUE);
	}

	@GetMapping("/getEmployees")
	public Response getAllEmployees() {
		System.out.println("-----------1111");
		List<Employee> employees = employeeService.findAll();
		return new Response("record counts : " + employees.size(), Boolean.TRUE);
	}
	
	@GetMapping("/hello/{id}")
	public String getSampleResponse(@PathVariable("id") int id) {
		System.out.println("---------2222222");
		return "Hi Ramesh Babu";
	}
}