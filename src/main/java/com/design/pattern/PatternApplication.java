package com.design.pattern;

import com.design.pattern.singleton.Employee;
import com.design.pattern.singleton.Labor;
import com.design.pattern.singleton.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);

		System.out.println("Singleton pattern ahead !!!");
		System.out.println("Lazy initialization !!!");
		Employee e= Employee.getEmployee();

		System.out.println(e.hashCode());

		Employee e1= Employee.getEmployee();

		System.out.println(e1.hashCode());

		Employee e2= Employee.getEmployee();

		System.out.println(e2.hashCode());

		Employee e3= Employee.getEmployee();

		System.out.println(e3.hashCode());

		System.out.println("Eager initialization !!!");
		Student s= Student.getStudent();
		System.out.println(s.hashCode());
		Student s1= Student.getStudent();
		System.out.println(s1.hashCode());


		//Thread safe
		System.out.println("Thread Safe initialization !!!");
		Labor l=Labor.getLabor();
		Labor l1= Labor.getLabor();
		System.out.println(l.hashCode());
		System.out.println(l1.hashCode());



	}

}
