package com.cognizant.ormlearn.association.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.association.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
