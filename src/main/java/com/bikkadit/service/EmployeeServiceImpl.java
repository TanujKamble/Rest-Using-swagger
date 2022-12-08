package com.bikkadit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.entity.Employee;
import com.bikkadit.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee emp) {
		Employee save = employeeRepository.save(emp);
		return save;
	}

}
