package com.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CrudApplicationService {

	private List<Student> studentList = new ArrayList<>(
			Arrays.asList(new Student(1, "Hari", 9), new Student(2, "Shankar", 10), new Student(3, "Sam", 8),
					new Student(4, "Siva", 9), new Student(5, "Prem", 8), new Student(6, "Prince", 10)));

	public List<Student> getAllStudent() {
		return studentList;
	}

	public Student getStudent(int id) {
		Student studentVal = new Student();
		for(Student students : studentList) {
			if(students.getId() == id) {
				studentVal = students;
			}
		}
	return studentVal;
	}
}
