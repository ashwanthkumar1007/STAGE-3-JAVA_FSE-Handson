package com.cognizant.ormlearn.association;

import java.util.Date;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.association.Entity.Department;
import com.cognizant.ormlearn.association.Entity.Employee;
import com.cognizant.ormlearn.association.service.DepartmentService;
import com.cognizant.ormlearn.association.service.EmployeeService;

@SpringBootApplication
public class RelationshipHandsonPractice3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RelationshipHandsonPractice3Application.class, args);
		EmployeeService empService = context.getBean(EmployeeService.class);
		DepartmentService deptService = context.getBean(DepartmentService.class);
		// Many to One  RelationShip
		// Add to Database
		
		
		Department dept = new Department();
		dept.setName("ECE");
		deptService.save(dept);
		
		//Department dept = deptService.findById(23);
		
		
		Employee employee = new Employee();
		employee.setName("Roody");
		employee.setPermanent(true);
		employee.setSalary(900000);
		employee.setDateOfBirth(new Date());
		
		
		employee.setDepartment(dept);
		empService.save(employee);
		

		// Fetch From DataBase
		
		Employee resultSet = empService.findById(25);
		
		System.out.println(resultSet);
		System.out.println(resultSet.getDepartment().getName());
		
		
		// Update Operation using Id
		empService.upadate(26);

		

		

	}

}
