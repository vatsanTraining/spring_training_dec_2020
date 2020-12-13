package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

// Lombok Annotations 
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


// JPA Related Annotations
@Entity
@Table(name = "practo_hospitals")
public class Patient {

	@Id    //JPA Annotations
	@Column(name = "patient_Id")
	int patientId;
	@Column(name="patientName")
	String patientName;
	@Column(name = "age")
	int age;
	
	
	
	     public Patient(int patientId, String patientName, int age) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
	}



		@ManyToOne
	    @JoinColumn(name="doctor_ref" ,referencedColumnName = "doctorId")
	    @JsonIgnore
	    private Doctor doctor;

}
