package com.student.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "student")
public class Student {
	
	@Id
	String id;
	String fullName;
	String gender;
	LocalDate birthDate;
	String documentType;
	int dni;
	
	public Student(String fullName, String gender, LocalDate birthDate, String documentType, int dni) {
		this.fullName = fullName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.documentType = documentType;
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String ToString() {
		return "Student ID: "+id+" Full Name:"+fullName+" Gender:"+gender+" Fecha de Nacimiento:"+birthDate+" Tipo de Documento:"+documentType+" DNI:"+dni;
	}
}
