package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class HandsonPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(HandsonPracticeApplication.class, args);
		CountryService service = context.getBean(CountryService.class);
		//get all Countries
		List<Country> allCountries = service.getAllCountries();
		System.out.println(allCountries);
		//Create and Save country objects to db
		Country country = new Country();
		country.setCode("AS");
		country.setName("Australia");
		Country result = service.save(country);
		System.out.println(result);
		
		service.testFindByName();
		service.testFindByNameAndDesc();
		service.testFindByDescContains();
		service.testFindByDescContains();
	}

}
