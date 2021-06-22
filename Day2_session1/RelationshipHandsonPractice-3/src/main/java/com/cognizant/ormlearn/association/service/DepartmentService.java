package com.cognizant.ormlearn.association.service;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.association.Entity.Department;
import com.cognizant.ormlearn.association.Entity.Employee;
import com.cognizant.ormlearn.association.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository repo;
	
	@Transactional
	public void save(Department department)
	{
		repo.save(department);
	}
	
	@Transactional
	public Department findById(int id)
	{
		return repo.findById(id).get();
	}
	
	@Transactional
	public void upadate(int id)
	{
		Department department = repo.findById(id).get();
		department.setName("ECE");
		Set<Employee> employees = department.getEmployee();
		employees.forEach(employee->employee.setPermanent(false));
		employees.forEach(employee->employee.setSalary(800000.00));
		repo.save(department);
		
	}

}
