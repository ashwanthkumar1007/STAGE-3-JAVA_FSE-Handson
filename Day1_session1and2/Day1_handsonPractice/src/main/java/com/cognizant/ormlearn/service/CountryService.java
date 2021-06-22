package com.cognizant.ormlearn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.entityRepository.CountryRepository;
import com.cognizant.ormlearn.model.Country;

@Service
public class CountryService {

	@Autowired
	CountryRepository repository;
	
	@Transactional
	public List<Country> getAllCountries()
	{
		return repository.findAll();
	}
	@Transactional
	public Country save(Country country)
	{
		Country result = repository.saveAndFlush(country);
		return result;
	}
	@Transactional
	public void testFindByName() {
		List<Country> countries = repository.findByName("India");
		countries.forEach(p -> System.out.println(p.getCode()));

		List<Country> countries2 = repository.findByName("America");
		countries2.forEach(p -> System.out.println(p.getCode()));
	}

	@Transactional
	public void testFindByNameAndDesc() {
		List<Country> countries = repository.findByNameAndDesc("India", "Australia");
		countries.forEach(p -> System.out.println(p.getCode()));
	}


	@Transactional
	public void testFindByDescContains() {
		List<Country> countries = repository.findByDescContains("Europe");
		countries.forEach(p -> System.out.println(p.getCode()));
	}

	
	@Transactional
	public void testFindByDescLike() {
		List<Country> countries = repository.findByDescLike("%LG%");
		countries.forEach(p -> System.out.println(p.getCode()));
	}

	

	
	
}
