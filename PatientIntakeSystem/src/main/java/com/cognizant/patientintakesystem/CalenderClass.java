package com.cognizant.patientintakesystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CalenderClass {
	
	private List<PatientAppoinment> appointmentsList;

	public CalenderClass() {
		this.appointmentsList = new ArrayList<PatientAppoinment>();
	}

	public void addAppointment(String patientName,int age, String gender, String appointmentTime, String doctor) {

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm a");
		LocalDateTime localDateTime;
		try {
			localDateTime = LocalDateTime.parse(appointmentTime, df);
		} catch (Throwable t) {
			throw new RuntimeException("Error! Please enter with format dd-M-yyyy hh:mm a");
		}
		
		Doctor doctorName = Doctor.valueOf(doctor.toLowerCase());

		PatientAppoinment newAppointment = new PatientAppoinment(patientName, age, gender,localDateTime, doctorName);
		appointmentsList.add(newAppointment);
	}

	public List<PatientAppoinment> getAppointmentsList() {
		return appointmentsList;
	}
	

}
