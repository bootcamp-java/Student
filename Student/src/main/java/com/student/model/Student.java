package com.student.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
	
	@Id
	String id;
	String fullName;
	String gender;
	int dni;
	
	public Student(String fullName, String gender, int dni) {
		this.fullName = fullName;
		this.gender = gender;
		this.dni = dni;		
	}	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String ToString() {
		return "Student ID: "+id+" Full Name:"+fullName+" Gender:"+gender+" DNI:"+dni;
	}
}
