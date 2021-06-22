package com.cognizant.flightmanagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.cognizant.flightmanagement.Enity.Flight;
import com.cognizant.flightmanagement.Enity.Passenger;
import com.cognizant.flightmanagement.Service.FlightService;
import com.cognizant.flightmanagement.Service.PassengerService;

@SpringBootTest
class FlightManagementApplicationTests {

	@Autowired
	ApplicationContext context;
	@Test
	void addPassengers() {
		//PassengerService passengerService = context.getBean(PassengerService.class);
		
		FlightService flightService = context.getBean(FlightService.class);
		
		Flight flight = new Flight();
		flight.setName("Indian Airways");
		flight.setType("Economy");

		//Flight flight = flightService.findByName("Indian Airways");
		//Flight flight = flightService.findById(702);
		//System.out.println(flight.getId());

		System.out.println(flight.getName());
		List<Passenger> passengers = new ArrayList<>();

		Passenger passenger1 = new Passenger();
		passenger1.setName("Ashwanth");
		passenger1.setAge(21);
		passenger1.setDestination("California");
		passenger1.setDateOfJourney(new Date());
		passenger1.setTicketClass("VIP");
		if (flight.getType().equalsIgnoreCase("business")) {
			if (flight.addPassenger(passenger1)) {
				passengers.add(passenger1);
			}
		} else {
			passengers.add(passenger1);
		}
		//passengerService.save(passenger1);
		
		
		Passenger passenger2 = new Passenger();
		
		passenger2.setName("Tommy");
		passenger2.setAge(22);
		passenger2.setDestination("California");
		passenger2.setDateOfJourney(new Date());
		passenger2.setTicketClass("VIP");
		if (flight.getType().equalsIgnoreCase("business")) {
			if (flight.addPassenger(passenger2)) {
				passengers.add(passenger2);
			}
		} else {
			passengers.add(passenger2);
		}
		//passengerService.save(passenger2);
		
		
		Passenger passenger3 = new Passenger();
		passenger3.setName("Edward");
		passenger3.setAge(25);
		passenger3.setDestination("California");
		passenger3.setDateOfJourney(new Date());
		passenger3.setTicketClass("NON-VIP");
		if (flight.getType().equalsIgnoreCase("business")) {
			if (flight.addPassenger(passenger3)) {
				passengers.add(passenger3);
			}
		} else {
			passengers.add(passenger3);
		}
		//passengerService.save(passenger3);
		
		

		Passenger passenger4 = new Passenger();
		passenger4.setName("Shelby");
		passenger4.setAge(21);
		passenger4.setDestination("California");
		passenger4.setDateOfJourney(new Date());
		passenger4.setTicketClass("NON-VIP");
		if (flight.getType().equalsIgnoreCase("business")) {
			if (flight.addPassenger(passenger4)) {
				passengers.add(passenger4);
			}
		} else {
			passengers.add(passenger4);
		}
		//passengerService.save(passenger4);
		
		flight.setPassengers(passengers);
		flightService.save(flight);
	}
	
	@Test
	void addFlights()
	{
		FlightService flightService = context.getBean(FlightService.class);
		Flight flight = new Flight();
		flight.setName("Indian Airways");
		flight.setType("Economy");
		
		flightService.save(flight);
		
	}
	
	@Test
	void removePassenger()
	{
		FlightService flightService = context.getBean(FlightService.class);
		PassengerService passengerService = context.getBean(PassengerService.class);
		
		Flight flight = flightService.findByName("Indian Airways");
		//Flight flight = flightService.findById(702);
		System.out.println(flight.getId());
		
		List<Passenger> passengers = flight.getPassengers();
		System.out.println(passengers);
		for(Passenger p : passengers)
		{
			if(p.getName().equalsIgnoreCase("Ashwanth"))
			{
				if(flight.removePasssenger(p))
				{
					passengerService.remove(p);
				}
			}
		}
		
		
	}

}
