package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.CrudApplicationService;
import com.springboot.service.Student;

@RestController
public class CrudApplicationController {
	
	@Autowired
	private CrudApplicationService crudApplicationService;
	
	@RequestMapping("/student")
	public List<Student> getAllStudent() {
		return crudApplicationService.getAllStudent();
	}
	
	@RequestMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return crudApplicationService.getStudent(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public void addStudent(@RequestBody Student student) {
		crudApplicationService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id) {
		crudApplicationService.updateStudent(student, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		crudApplicationService.deleteStudent(id);
	}	
}
