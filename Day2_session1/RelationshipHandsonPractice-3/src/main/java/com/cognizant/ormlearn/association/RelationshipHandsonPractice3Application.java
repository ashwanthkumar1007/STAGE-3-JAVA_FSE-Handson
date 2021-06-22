package com.cognizant.ormlearn.association;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.association.Entity.Department;
import com.cognizant.ormlearn.association.Entity.Employee;
import com.cognizant.ormlearn.association.service.DepartmentService;

@SpringBootApplication
public class RelationshipHandsonPractice3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RelationshipHandsonPractice3Application.class, args);
		DepartmentService deptService = context.getBean(DepartmentService.class);

		// One to Many RelationShip
		// Add to Database
		Department dept = new Department();
		dept.setName("CSE");
		Set<Employee> employees = new HashSet<>();

		Employee employee = new Employee();
		employee.setName("Ashwanth");
		employee.setPermanent(true);
		employee.setSalary(600000);
		employee.setDateOfBirth(new Date());
		employees.add(employee);
		employee.setDepartment(dept);

		Employee employee1 = new Employee();
		employee1.setName("Thommy");
		employee1.setPermanent(true);
		employee1.setSalary(600000);
		employee1.setDateOfBirth(new Date());
		employees.add(employee1);
		employee1.setDepartment(dept);

		dept.setEmployee(employees);

		deptService.save(dept);

		// Fetch From DataBase
		Department resultSet = deptService.findById(23);
		System.out.println(resultSet.getName());
		System.out.println(resultSet.getId());
		Set<Employee> employeesSet = resultSet.getEmployee();
		employeesSet.forEach(emp -> System.out.println(emp));

		// Update Operation using Id
		deptService.upadate(13);

		

		

	}

}
