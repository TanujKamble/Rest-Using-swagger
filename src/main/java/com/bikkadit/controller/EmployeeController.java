package com.bikkadit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.entity.Employee;
import com.bikkadit.service.EmployeeServiceI;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceI employeeService;
	

	@PostMapping(value = "/saveEmployee",consumes = {"application/xml","application/json"},produces = {"application/xml","application/json"})
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		
		Employee saveEmployee = employeeService.saveEmployee(emp);
		return new ResponseEntity<Employee>(saveEmployee, HttpStatus.CREATED);}

}
