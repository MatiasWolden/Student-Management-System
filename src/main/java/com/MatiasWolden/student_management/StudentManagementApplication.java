package com.MatiasWolden.student_management;

import com.MatiasWolden.student_management.Model.Student;
import com.MatiasWolden.student_management.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student matias = new Student("Matias", "Wolden", "H123456", "Dataingeniør");
			repository.save(matias);
		};
	}
}
