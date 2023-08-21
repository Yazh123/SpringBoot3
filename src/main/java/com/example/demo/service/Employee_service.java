package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.Employee_repo;


@Service
public class Employee_service {
	@Autowired
	Employee_repo er;
	
	public Employee saveinfo(Employee ss) {
		return er.save(ss); 
	}
	
	public List<Employee> showinfo(){
		return er.findAll(); 
	}
}
