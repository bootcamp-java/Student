package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//Create new student
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		return studentService.create(student);
	}

	//Get For Name
	@GetMapping("/get/{fullName}")
	public List<Student> getStudent(@PathVariable("fullName") String fullName) {
		return studentService.getByFullName(fullName);
	}
	
	//Get All
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return studentService.getAll();
	}
	
	//Update student
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		return studentService.update(student);
	}
	
	//Delete For ID
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") String id) {
		studentService.delete(id);
		return "Deleted "+id;
	}
	
	//Delete All
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		studentService.deleteAll();
		return "Deleted All";
	}
}

/*
 Falta Busqueda por fecha
 Falta Docker
 Falta Programación Reactiva
 */










