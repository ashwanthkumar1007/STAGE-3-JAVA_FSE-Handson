package com.ashwanth.jpa.generators.repository.Service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwanth.jpa.generators.Entity.Employee;
import com.ashwanth.jpa.generators.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public void save(Employee employee)
	{
		repo.save(employee);
	}
	public Employee findById(Long id)
	{
		Optional<Employee> optional = repo.findById(id);
		if(optional!=null)
		{
			Employee resultSet = new Employee();
			return resultSet;
		}
		return null;
	}
	
}
