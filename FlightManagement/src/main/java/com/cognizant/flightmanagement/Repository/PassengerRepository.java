package com.cognizant.flightmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.flightmanagement.Enity.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {

}
