package com.design.pattern;

import com.design.pattern.singleton.Employee;
import com.design.pattern.singleton.Labor;
import com.design.pattern.singleton.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

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



		//Streaming examples


		//1. Sum of Odd Numbers

		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);

		int result = nums.stream().filter(n->n%2!=0).reduce(0,(a,b)->a+b);

		System.out.println("Sum of odd numbers: - "+result);



		// 2. Total characters in all List
		List<String> names = List.of("Prapti", "Boo", "Java");

		int totalCharacters = names.stream().map(name->name.length())
						.reduce(0,(a,b)->a+b);

		System.out.println("total characters in list :- "+totalCharacters);


		// 3. Total elements in all list
		List<String> namesList = List.of("Prapti", "Boo", "Java","Hello","World");

		Long totalElements = namesList.stream().count();

		System.out.println("total elements in list :- "+totalElements);

		// 4. Total distinct elements in all list
		List<String> namesList1 = List.of("Prapti", "Boo", "Java","Hello","World","Boo","Java");

		Long disitnctCount = namesList1.stream().distinct().count();

		System.out.println("total disitnct elements in list :- "+disitnctCount);


		//5. Join names with a comma
		List<String> namesComma = List.of("Prapti", "Boo", "Java");
		String resultComma = namesComma.stream().collect(Collectors.joining(", "));
		System.out.println(resultComma);
	}


}
