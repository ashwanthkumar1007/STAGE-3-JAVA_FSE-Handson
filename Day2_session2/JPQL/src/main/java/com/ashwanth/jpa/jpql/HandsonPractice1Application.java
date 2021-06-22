package com.ashwanth.jpa.jpql;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ashwanth.jpa.jpql.entity.Student;
import com.ashwanth.jpa.jpql.service.StudentService;

@SpringBootApplication
public class HandsonPractice1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HandsonPractice1Application.class, args);
		StudentService service = context.getBean(StudentService.class);
		
		//Save 
//		Student student = new Student();
//		student.setFirstName("Ashwanth");
//		student.setLastName("Kumar");
//		student.setScore(100);
//		service.save(student);
		
		List<Student> findAllStudents = service.findAllStudents();
		System.out.println(findAllStudents);
		
		System.out.println("---------------------------------------");
		
		List<Object[]> resultObjects = service.findFnameAndLname();
		for(Object[] objects: resultObjects)
		{
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

}
