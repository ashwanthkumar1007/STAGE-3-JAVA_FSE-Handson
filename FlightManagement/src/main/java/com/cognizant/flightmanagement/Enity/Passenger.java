package com.cognizant.flightmanagement.Enity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_id")
	private int id;
	
	@Column(name="p_name")
	private String name;
	
	@Column(name="dest")
	private String destination;
	
	@Column(name="date_of_journey")
	private Date dateOfJourney;
	
	@Column(name="age")
	private int age;
	
	@Column(name="ticket_class")
	private String ticketClass;
	
	@ManyToMany(mappedBy = "passengers",cascade = CascadeType.ALL)
	private List<Flight> flights;
	
	

}
