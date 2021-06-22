package com.ashwanth.jpa.generators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ashwanth.jpa.generators.Entity.Employee;
import com.ashwanth.jpa.generators.repository.Service.EmployeeService;

@SpringBootApplication
public class JpaGeneratorsApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(JpaGeneratorsApplication.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
		
		//save employee object
		Employee employee = new Employee();
		employee.setName("Aravindh");
		service.save(employee);
		
		//list employee from db
		Employee result =service.findById((long)100);
		System.out.println("+++++++++++++"+result);
	}

}
