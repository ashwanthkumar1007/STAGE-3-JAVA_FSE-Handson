package com.ashwanth.jpa.generators.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwanth.jpa.generators.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
