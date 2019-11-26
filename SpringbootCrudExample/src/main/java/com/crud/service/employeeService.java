package com.crud.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Employee;
import com.crud.repository.employeeRepository;

@Service
public class employeeService {
	@Autowired
	employeeRepository empRepo;

	public Collection<Employee>  findAllEmployees() {
		ArrayList<Employee> emp=(ArrayList<Employee>) empRepo.findAll();
		return emp;
	}
	

}
