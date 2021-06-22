package com.cognizant.patientintakesystem;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientAppoinment {

	private String patientName;
	private int age;
	private String gender;
	private LocalDateTime appointmentDateTime;
	private Doctor doctor;
	

}
