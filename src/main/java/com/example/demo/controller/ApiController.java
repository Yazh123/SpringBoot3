package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.Employee_service;

@RestController
public class ApiController {
	@Autowired
	Employee_service eser;
	
	@PostMapping("/")
	public boolean addinfo(@RequestBody Employee emp) {
		boolean ans = eser.saveinfo(emp)!= null;
		return ans;
	}
	
	@PostMapping("/n")
    public boolean addarr(@RequestBody List<Employee> emp) {
		eser.array(emp);
		return true;
    }
	
	@GetMapping("/")
	public List<Employee> show(){
		return eser.showinfo();
	}
	
	@GetMapping("/{id}")
    public Optional<Employee> findid(@PathVariable int id)
    {
        return eser.find(id);
    }
	
	@GetMapping("get")
    public Optional<Employee> getid(@RequestParam int id)
    {
        return eser.get(id);
    }
}
