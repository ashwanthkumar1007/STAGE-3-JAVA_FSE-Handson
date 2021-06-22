package com.cognizant.ormlearn.association.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.association.Entity.Employee;
import com.cognizant.ormlearn.association.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Transactional
	public void save(Employee employee)
	{
		repo.save(employee);
	}
	
	@Transactional
	public Employee findById(int id)
	{
		return repo.findById(id).get();
	}

}
