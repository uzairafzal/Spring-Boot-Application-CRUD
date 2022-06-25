package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class DemoApplication implements CommandLineRunner {

	@Autowired
	EmpRepository empRepository;




	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1, "Mr. Amin", "Street 2");
		Employee e2 = new Employee(2, "Mr. Akeel", "Street 3");

		empRepository.employee.addAll(Arrays.asList(e1, e2));

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.print("Hello Spring");
	}
	@GetMapping
	public String Hello(){
		return	"Hello Spring";
	}
}
