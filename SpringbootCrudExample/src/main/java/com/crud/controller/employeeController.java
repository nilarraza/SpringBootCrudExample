package com.crud.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.model.Employee;
import com.crud.repository.employeeRepository;
import com.crud.service.employeeService;

@Controller
public class employeeController {
	
	@Autowired
	employeeRepository emRepo;
	@Autowired
	employeeService empservice;
	
	@GetMapping("/index")
	public String indexPage() {
		return "index.jsp";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(Employee employee,ModelMap modelmap) {
		emRepo.save(employee);
		modelmap.addAttribute("msg", "Succesfully Added");
		return "index.jsp";
	}
	
	
	
	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(int id,ModelMap modelmap) {
		emRepo.deleteById(id);
		modelmap.addAttribute("msg","Succesfully deleted");
		return "list.jsp";
	}
	
	@GetMapping("/findEmployee")
	public Optional<Employee> findEmployee(int id) {
	
		return emRepo.findById(id);
	}
	
	@GetMapping("/listEmployee")
	public Collection<Employee> listEmployee() {

		return empservice.findAllEmployees();
	}
	

	
	
	


}
