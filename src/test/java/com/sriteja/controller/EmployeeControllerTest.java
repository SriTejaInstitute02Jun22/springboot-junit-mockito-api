package com.sriteja.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sriteja.bean.Employee;
import com.sriteja.bean.Response;
import com.sriteja.service.IEmployeeService;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

	@MockBean
	private IEmployeeService employeeServiceMock;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void testAddEmployee() throws Exception {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setDept("IT");
		employee.setName("Pallavi");

		MvcResult result = mockMvc
				.perform(post("/api/addEmployee").contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(employee)))
				.andExpect(status().isOk()).andDo(print()).andReturn();

		System.out.println("===========result========" + result);

		String resultContent = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContent, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);

	}

	@Test
	public void testGetAllEmployees() throws Exception {
		System.out.println("getAllEmployees==============");
		MockHttpServletResponse getResponse = mockMvc
				.perform(get("/api/getEmployees").accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();
		String result = getResponse.getContentAsString();
		Response response = objectMapper.readValue(result, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);
	}

	@Test
	public void testGetSampleResponse() throws Exception {

		int id = 10;
		System.out.println("1111111111111");
		MockHttpServletResponse getResponse = mockMvc.perform(get("/api/hello/{id}", id)).andExpect(status().isOk())
				.andDo(print()).andReturn().getResponse();
		
		String result = getResponse.getContentAsString();
		Assert.assertEquals(result, "Hi Ramesh Babu");
	}

}
