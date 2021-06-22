package com.cognizant.flightmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.flightmanagement.Enity.Passenger;
import com.cognizant.flightmanagement.Repository.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepo;

	public void save(Passenger passenger) {
		passengerRepo.save(passenger);
	}

	public Passenger findById(int id) {
		return passengerRepo.findById(id).get();

	}
	public void remove(Passenger passenger)
	{
		passengerRepo.delete(passenger);
	}

}
