package com.cognizant.patientintakesystem;

public enum Doctor {
	
	Robert("2kBH01","Robert"),
	Josh("2kBH02","Josh"),
	Chandler("2kBH03","Chandler");
	
	private final String doctorName;
	private final String doctorId;
	
	
	private Doctor(String doctorId, String doctorName) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public String getDoctorId() {
		return doctorId;
	}

	
}
