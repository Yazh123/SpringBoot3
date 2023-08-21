package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.Employee_service;

@RestController
public class ApiController {
	@Autowired
	Employee_service eser;
	
	@PostMapping("/")
	public Employee addinfo(@RequestBody Employee emp) {
		return eser.saveinfo(emp);
	}
	
	@GetMapping("{id}")
	public List<Employee> show(){
		return eser.showinfo();
	}
	
}
