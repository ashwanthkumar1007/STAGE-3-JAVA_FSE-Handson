package com.cognizant.flightmanagement.Enity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="flight")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Flight {
	
	@TableGenerator(name="flight_gen", table="id_gen", pkColumnName="gen_name", valueColumnName="gen_num", allocationSize=100)
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="flight_gen")
	@Column(name="f_id")
	private int id;
	
	@Column(name="f_type")
	private String type;
	
	@Column(name="f_name")
	private String name;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="passengers_flight",
	joinColumns = @JoinColumn(name="flight_id", referencedColumnName = "f_id"),
	inverseJoinColumns = @JoinColumn(name="passenger_id", referencedColumnName = "p_id"))
	private List<Passenger> passengers;
	
	
	public boolean addPassenger(Passenger passenger)
	{
		if(passenger.getTicketClass().equalsIgnoreCase("vip"))
		{
			return true;
		}
		return false;
	}
	
	public boolean removePasssenger(Passenger passenger)
	{
		if(passenger.getTicketClass().equalsIgnoreCase("vip"))
		{
			return true;
		}
		return false;
	}

}
