package com.ashwanth.jpa.jpql.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwanth.jpa.jpql.entity.Student;
import com.ashwanth.jpa.jpql.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public void save(Student student)
	{
		repo.save(student);
		
		System.out.println("Added to Database Successfully");
	}
	
	public List<Student> findAllStudents()
	{
		List<Student> result = repo.findAllStudents();
		return result;
	}
	
	public List<Object[]> findFnameAndLname()
	{
		List<Object[]> result = repo.findFisrtNameAndLastName();
		return result;
	}
}
