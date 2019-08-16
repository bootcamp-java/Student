package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//Create Operation
	public Student create(Student student) {
		return studentRepository.save(student);
	}
	
	//Retrieve Operation
	public List<Student> getAll(){
		return studentRepository.findAll();
	}
	
	public List<Student> getByFullName(String fullName) {
		return studentRepository.findByfullName(fullName);
	}
	
	//Update Operation
	public Student update(Student student) {
		return studentRepository.save(student);
	}
	
	//Delete Operation
	public void deleteAll() {
		studentRepository.deleteAll();
	}
	
	public void delete(String id) {
		studentRepository.deleteById(id);
	}
}




