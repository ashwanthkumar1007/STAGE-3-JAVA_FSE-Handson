package com.cognizant.patientintakesystem;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	public static final Logger logger = LoggerFactory.getLogger(Main.class);
	private static CalenderClass calendar = new CalenderClass();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Global Hospital Booking System" + "\n" + "Select an option?");
		int choice = 0;
		do {
			System.out.println("\n1. Add a patient appointment" + "\n" + "2. View all appointments" + "\n" + "3. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				logger.info("Data Form getData()");
				addPatientAppointment();
				break;
			case 2:
				logger.info("Data Form getData()");
				viewAllAppointments();
				break;
			}
		} while (choice != 3);

		System.out.println("Thank You!!!");
		sc.close();
	}

	private static void addPatientAppointment() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------Enter The Patient details---------------");
		System.out.println("Enter patient name:");
		String patientName = sc.nextLine();
		System.out.println("Enter patient Age:");
		int patientAge = sc.nextInt();
		System.out.println("Gender:");
		sc.nextLine();
		String gender = sc.nextLine();
		System.out.println("Enter appointment date and time (dd-M-yyyy hh:mm a):");
		String appointmentTime = sc.nextLine();
		System.out.println("Enter doctor value:");
		String doctorName = sc.nextLine();
		sc.close();
		
		try {
			calendar.addAppointment(patientName, patientAge, gender, appointmentTime, doctorName);
			System.out.println("Patient added sucessfully");
		} catch (Throwable t) {
			System.out.println(t.getMessage());
			return;
		}
		
	}

	private static void viewAllAppointments() {
		List<PatientAppoinment> appointmentsList = calendar.getAppointmentsList();
		if (appointmentsList.isEmpty())
			System.out.println("No appointments");
		else {
			for (PatientAppoinment appointments : appointmentsList) {
				DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm a");
				String datetime = df.format(appointments.getAppointmentDateTime());

				System.out.println("Patient Name: " + appointments.getPatientName() + "\n" + "Appointment Date Time: "
						+ datetime + "\n" + "Doctor Name: " + appointments.getDoctor().getDoctorName() + "\n");
			}
		}
	}

}

