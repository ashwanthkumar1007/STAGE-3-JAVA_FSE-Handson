package com.cognizant.ormlearn.association;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.association.Entity.Employee;
import com.cognizant.ormlearn.association.Entity.Skill;
import com.cognizant.ormlearn.association.service.EmployeeService;

@SpringBootApplication
public class RelationshipHandsonPractice3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RelationshipHandsonPractice3Application.class, args);
		EmployeeService empService = (EmployeeService)context.getBean(EmployeeService.class);
		System.out.println("Error has been created");
		
		Employee employee = new Employee();
		employee.setDateOfBirth(new Date());
		employee.setName("Ned");
		employee.setPermanent(true);
		employee.setSalary(750000);
		List<Skill> skills = new ArrayList<>();
		
		Skill skill1 = new Skill();
		skill1.setName("FootBall");
		skills.add(skill1);
		//skillService.save(skill1);
		
		
		Skill skill2 = new Skill();
		skill2.setName("Dancing");
		skills.add(skill2);
		//skillService.save(skill2);
		
		Skill skill3 = new Skill();
		skill3.setName("Coding");
		skills.add(skill3);
		//skillService.save(skill3);
		
		Skill skill4 = new Skill();
		skill4.setName("Drawing");
		skills.add(skill4);
		//skillService.save(skill4);
	
		employee.setSkills(skills);
		empService.save(employee);
		
}

}
