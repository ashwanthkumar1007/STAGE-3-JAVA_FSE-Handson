package com.cognizant.flightmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.flightmanagement.Enity.Flight;
import com.cognizant.flightmanagement.Repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepo;

	public void save(Flight flight) {
		flightRepo.flush();
		flightRepo.save(flight);
		}

	public Flight findById(int id) {
		return flightRepo.findById(id).get();

	}
	public Flight findByName(String name)
	{
		return flightRepo.findByName(name);
	}

}
