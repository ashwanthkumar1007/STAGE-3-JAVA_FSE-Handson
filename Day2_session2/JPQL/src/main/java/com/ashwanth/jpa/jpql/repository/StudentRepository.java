package com.ashwanth.jpa.jpql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwanth.jpa.jpql.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query("from Student")
	List<Student> findAllStudents();
	
	@Query("select firstName, lastName from Student")
	List<Object[]> findFisrtNameAndLastName();
}
