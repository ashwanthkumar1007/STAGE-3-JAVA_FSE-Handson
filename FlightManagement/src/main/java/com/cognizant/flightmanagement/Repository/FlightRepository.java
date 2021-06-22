package com.cognizant.flightmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.flightmanagement.Enity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
	Flight findByName(String name);

}
